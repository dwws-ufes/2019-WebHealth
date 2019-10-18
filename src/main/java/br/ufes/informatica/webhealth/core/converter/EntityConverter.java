package br.ufes.informatica.webhealth.core.converter;

import java.util.HashMap;
import java.util.Map;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.ufes.inf.nemo.jbutler.ejb.persistence.PersistentObject;

@FacesConverter("entityConverter")
public class EntityConverter implements Converter<PersistentObject> {


	public PersistentObject getAsObject(FacesContext ctx, UIComponent component, String value) {
		if (value != null) {
			return (PersistentObject) this.getAttributesFrom(component).get(value);
		}
		return null;
	}

	public String getAsString(FacesContext ctx, UIComponent component, PersistentObject value) {

		if (value != null && !"".equals(value)) {

			PersistentObject entity = (PersistentObject) value;
			this.addAttribute(component, entity);

			Long codigo = entity.getId();
			if (codigo != null) {
				return String.valueOf(codigo);
			}
		}

		return value.toString();
	}

	protected void addAttribute(UIComponent component, PersistentObject o) {
		String key = o.getId().toString(); // codigo da empresa como chave neste caso
		this.getAttributesFrom(component).put(key, o);
	}

	protected Map<String, Object> getAttributesFrom(UIComponent component) {
		return component.getAttributes();
	}
}