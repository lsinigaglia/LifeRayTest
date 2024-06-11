package formAttiDiAdesione.portlet;

import formAttiDiAdesione.constants.FormAttiDiAdesionePortletKeys;
import servicebuilder.model.AttiDiAdesione;
import servicebuilder.service.AttiDiAdesioneLocalService;

import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.text.SimpleDateFormat;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


/**
 * @author A.Stoian
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=FormAttiDiAdesione",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FormAttiDiAdesionePortletKeys.FORMATTIDIADESIONE,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FormAttiDiAdesionePortlet extends MVCPortlet {
	
	private static final Log _log = LogFactoryUtil.getLog(FormAttiDiAdesionePortlet.class);

    @ProcessAction(name = "submitForm")
 
    public void submitForm(ActionRequest actionRequest, ActionResponse actionResponse) throws java.text.ParseException {
 
    	String codiceAttoDiAdesione = ParamUtil.getString(actionRequest, "codiceAttoDiAdesione");
    	
        long codiceAccordo = ParamUtil.getLong(actionRequest, "codiceAccordo");
 
        Integer anno = ParamUtil.getInteger(actionRequest, "anno");
 
        String stato = ParamUtil.getString(actionRequest, "stato");
 
        String dataStato = ParamUtil.getString(actionRequest, "dataStato");
        
        String descrizione = ParamUtil.getString(actionRequest, "descrizione");
 
        double importoComplessivo = ParamUtil.getDouble(actionRequest, "importoComplessivo");
 
   

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        long idAttoDiAdesione = CounterLocalServiceUtil.increment(AttiDiAdesione.class.getName());

    	AttiDiAdesione attiDiAdesione = _attiDiAdesioneLocalService.createAttiDiAdesione(idAttoDiAdesione);
    	
    	attiDiAdesione.setCodiceAttoDiAdesione(codiceAttoDiAdesione);

    	attiDiAdesione.setFK_accordoQuadro(codiceAccordo);

    	attiDiAdesione.setAnno(anno);
    	
    	attiDiAdesione.setStato(stato);

    	attiDiAdesione.setDataStato(sdf.parse(dataStato));

    	attiDiAdesione.setDescrizione(descrizione);

		attiDiAdesione.setImportoComplessivo(importoComplessivo);

    	_attiDiAdesioneLocalService.updateAttiDiAdesione(attiDiAdesione);

    	_log.info("attiDiAdesione: "+ attiDiAdesione);

    }

    @Reference

    AttiDiAdesioneLocalService _attiDiAdesioneLocalService;

}
	
	
