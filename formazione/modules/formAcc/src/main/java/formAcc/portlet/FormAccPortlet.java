package formAcc.portlet;

import formAcc.constants.FormAccPortletKeys;
import servicebuilder.model.AccordoQuadro;
import servicebuilder.service.AccordoQuadroLocalService;

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
		"javax.portlet.display-name=FormAcc",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + FormAccPortletKeys.FORMACC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class FormAccPortlet extends MVCPortlet {
	
	private static final Log _log = LogFactoryUtil.getLog(FormAccPortlet.class);

	    @ProcessAction(name = "submitForm")
	 
	    public void submitForm(ActionRequest actionRequest, ActionResponse actionResponse) throws java.text.ParseException {
	 
	        String codiceAccordo = ParamUtil.getString(actionRequest, "codiceAccordo");
	 
	        String descrizione = ParamUtil.getString(actionRequest, "descrizione");
	 
	        String dataInizioValidita = ParamUtil.getString(actionRequest, "dataInizioValidita");
	 
	        String dataFineValidita = ParamUtil.getString(actionRequest, "dataFineValidita");
	 
	        double importoComplessivo = ParamUtil.getDouble(actionRequest, "importoComplessivo");
	 
	   

	        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	        long idAccordoQuadro = CounterLocalServiceUtil.increment(AccordoQuadro.class.getName());

	    	AccordoQuadro accordoQuadro = _accordoQuadroLocalService.createAccordoQuadro(idAccordoQuadro);

	    	accordoQuadro.setCodiceAccordo(codiceAccordo);

	    	accordoQuadro.setDescrizione(descrizione);

	    	accordoQuadro.setDataInizioValidita(sdf.parse(dataInizioValidita));

			accordoQuadro.setDataFineValidita(sdf.parse(dataFineValidita));

	    	accordoQuadro.setImportoComplessivo(importoComplessivo);

	    	_accordoQuadroLocalService.updateAccordoQuadro(accordoQuadro);

	    	_log.info("accordoQuadro: "+accordoQuadro);

	    }

	    @Reference

	    AccordoQuadroLocalService _accordoQuadroLocalService;
	
}