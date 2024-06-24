import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://test-app01.cne.gob.ec/login/login.aspx')

WebUI.click(findTestObject('Object Repository/Page_/td_ELECCIONES GENERALES 2025_dxgvCommandCol_97a7da'))

WebUI.click(findTestObject('Object Repository/Page_/div_Aceptar'))

WebUI.setText(findTestObject('Object Repository/Page_/input_USUARIO_popIngresoUsuariotxtUsuario'), 'HE')

WebUI.click(findTestObject('Object Repository/Page_/span_USUARIO'))

WebUI.setText(findTestObject('Object Repository/Page_/input_USUARIO_popIngresoUsuariotxtUsuario'), 'hectorpupiales')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_/input_CONTRASEA_popIngresoUsuariotxtContrasena'), 'TXcqM7LxSGrFonOlb6b5VQ==')

WebUI.click(findTestObject('Object Repository/Page_/div_Aceptar_1'))

WebUI.click(findTestObject('Object Repository/Page_/span_POST ELECTORAL'))

WebUI.click(findTestObject('Object Repository/Page_/span_PARAMETRIZACIN DE PORCENTAJES DE SUPERVISIN'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://camdom-desa.cne.gob.ec/params-mensajes')

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_Crear'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_Nuevo Mensaje_dx-dropdowneditor-icon'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_10'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_ELECCIONES GENERALES 2017_dx-scrollable_6f1775'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_ELECCIONES GENERALES 2017_dx-scrollable_6f1775'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_ELECCIONES GENERALES 2017_dx-scrollable_6f1775'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/td_ELECCIONES GENERALES 2017'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_Fecha Fin_dx-dropdowneditor-icon'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_Suspensin de derechos polticos por CNE o TCE'))

WebUI.setText(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/textarea_Loading_notificacion'), 'mensaje para suspension derechos politicos')

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/span_Agregar'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/span_Nmero de veces que se usa el nmero nic_b0af14'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/i_mensaje a ser enviado por numero de veces_c703d2'))

WebUI.setText(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/textarea_Loading_notificacion'), 'mensaje a ser enviado por numero de veces que se usa el numero unico de suministro electrico SE AGREGA DATOS AL CAMPO')

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/span_Editar'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_2'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_3'))

WebUI.click(findTestObject('Object Repository/REP_MENSAJES/Page_05CAMDOM/div_4'))

