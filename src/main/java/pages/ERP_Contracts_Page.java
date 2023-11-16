package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import supportlibraries.*;
import com.LT.framework.*;

import businesscomponents.CommonFunctions;
//import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;


    public class ERP_Contracts_Page extends MasterPage{
            private static WebElement element = null;
            CommonFunctions CF = new CommonFunctions(scriptHelper);
            public ERP_Contracts_Page(ScriptHelper scriptHelper)
        	{
        		super(scriptHelper);	
        	}


        public static By createContract_Lnk = By.id("pt1:USra:0:RAp1:0:RAtl1");
        public static By businessUnit_DrpDwn = By.name("pt1:USra:0:RAp1:0:dynam1:0:orgNameId");
        public static By legalEntity_DrpDwn = By.name("pt1:USra:0:RAp1:0:dynam1:0:legalEntityNameId");
        public static By contractType_DrpDwn = By.name("pt1:USra:0:RAp1:0:dynam1:0:contractTypeId");
        public static By primaryParty_DrpDwn = By.name("pt1:USra:0:RAp1:0:dynam1:0:partyNameId");
        public static By currency_DrpDwn = By.id("pt1:USra:0:RAp1:0:dynam1:0:currencyCodeId");
        public static By AuthoringParty_DrpDwn1 = By.id("pt1:USra:0:RAp1:0:dynam1:0:soc1::content"); /* Suraj Added*/
        public static By saveAndContinue_Btn = By.id("pt1:USra:0:RAp1:0:dynam1:0:cb1");
        public static By ocwenContractGroup_DrpDwn = By.name("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r1:0:df1_ContractHeaderFlexfield1IteratorocwenContractGroup__FLEX_EMPTY");
        public static By lines_Lnk = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:LinesTab::disAcr");
        public static By addLines_Icon = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:AT1:_ATp:create::icon");
        public static By nameOnCreateLine_TxtBox = By.name("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:AT1:inputText4");
        public static By ok_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:AT1:saveACBtn1");
        public static By submit_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APsb2");
        public static By submitFinal_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:APsb2");
        // 											pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermsTab::disAcr
        public static By contractTerms_Lnk = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermsTab::disAcr");
        public static By addContractsTerms_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermA1:0:commandButton11");
        public static By contractNumber_Wel = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APph::_afrTtxt']//div//h1");
        // new elements added by suraj to add the line amount
        
        public static By UOM_DrpDwn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:2:uomCodeId::content");
        public static By UnitPrice_TxtBox = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:2:PriceUnitId::content");
        public static By LineQuantity_TxtBox = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:2:numOfItemId::content");
  
        // End   
        public static By AuthorityParty2_DrpDwn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermA1:0:authoringPartyChoice1::content");//Suraj added ( name changed to id)
        public static By contractSource_DrpDwn = By.name("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermA1:0:contractSourceChoice1");
        public static By browse_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermA1:0:inputFile12::content");//name changed to id
        public static By okOnAddContractsTersms_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:TermA1:0:okButton");
        public static By error_Wel =By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:1:AP1:panelLabelAndMessage3']//tbody//tr//td[2]");
        public static By next_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:1:AP1:commandButton3");
        public static By approve_TxtBox = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:it1::content");
        
        
        public static By cancel_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APc");
        public static By home_Icon = By.id("pt1:_UIShome::icon");
        /*
         * Validation check point
         */
        
        public static By contractStatus_Wel = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r2:0:panelLabelAndMessage1']//td[2]");
        
         // Amend section
        public static By contract1_lnk = By.id("pt1:_UIScml21");
        public static By saveArrow_drpdwn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APsv2::popEl");
        public static By saveandclose_opt = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:commandMenuItem3']/td[2]");
        public static By pendingcontract_lnk = By.id("pt1:USma:0:MAnt1:0:pt1:conDashbrdMain1:r3:0:AT1:_ATp:resId1:0:cl2");
        public static By Action_drpdwn = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:actionButtonBarMenu']/div/table/tbody/tr/td[3]/div");
        public static By Stopvalidation_opt = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:commandMenuItem21']/td[2]");
        public static By Stopvalidation_btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:cb4");
        public static By Itemmaster_inputbx = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r1:0:invOrgNameId::content");
        public static By Save_btn = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APsv2']/table/tbody/tr/td[1]/a/span");
        public static By Cancel_opt = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:commandMenuItem10']/td[2]");
        public static By Reason_input = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r9:1:selectOneChoice1::content");
        public static By SaveAndClose_btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r9:1:btnSaver");
        public static By Submit1_btn= By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:APsb2");
        public static By Next1_btn= By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:1:AP1:commandButton3");
        public static By Input1_Txtbx= By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:it1::content");
        public static By Submit2_btn= By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:APsb2");
        public static By Cancel1_btn= By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r9:1:btnCancel");
        
        
        
        // Addition of Contract documents
        public static By Documents_lnk = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:np1:commandNavigationItem3");
        public static By Add_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:DocAu1:1:okc_docs_at1:applicationsTable:_ATp:create::icon");
        public static By Browse2_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:DocAu1:1:okc_docs_at1:applicationsTable:_ATp:attachmentTable:0:desktopFile::content");
        public static By Overview_lnk = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:np1:commandLink1");
        public static By Delete_btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:DocAu1:1:okc_docs_at1:applicationsTable:_ATp:delete::icon");
        public static By Yes_btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:DocAu1:1:okc_docs_at1:confirm");
      
        //Add approvers**
        public static By ApproveArrow_btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:sdh1::_afrDscl");
        public static By Approver1_Opt = By.xpath(".//*[@id='pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:taskHistoryTable::db']/table/tbody/tr[2]/td[2]/div/table/tbody/tr/td");
        public static By AddApprover_icon = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:dc_i1");
        public static By User_Inpt = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:addAssigneeUserName::content");
        public static By Ok2_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:addParticipantPopup::ok");
        public static By Apply_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:approvalListSaveButton");
        public static By ApproverScroll_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:taskHistoryTable:0::di");
     //   public static By ApproverFetch_Btn = By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:1:taskhistory:taskHistoryTable:0::di");
        
        WebDriverWait wait = new WebDriverWait(driver, 10);
        
        
        
        public ERP_Contracts_Page AccessContractOptions(String strContractOption) throws InterruptedException {
        
        	switch (strContractOption) {
			case "CreateContract":
				CF.clickOnElement(createContract_Lnk, "Create Contracts", "link");
				break;

			default:
				break;
			}
        	
        	 return new ERP_Contracts_Page(scriptHelper);
        }
        
        public ERP_Contracts_Page EnterContractDetails() throws InterruptedException{
    	 
        	String strBusinessUnit = dataTable.getData("General_Data", "BusinessUnit");
        	//String strLegalEntity = dataTable.getData("General_Data", "LegalEntity");
        	String strContractType = dataTable.getData("General_Data", "ContractType");
        	String strPrimaryParty = dataTable.getData("General_Data", "PrimaryParty");
        	//String strCurrency = dataTable.getData("General_Data", "Currency");
        	String strAuthoringParty1 = dataTable.getData("General_Data", "AuthoringParty1");
        	CF.enterValues(businessUnit_DrpDwn, "Business Unit", strBusinessUnit );
            CF.performTab(businessUnit_DrpDwn, 1);
        	Thread.sleep(3000);
        	/*CF.enterValues(legalEntity_DrpDwn, "Legal Entity", strLegalEntity);
        	Thread.sleep(3000);*/
        	CF.enterValues(contractType_DrpDwn, "Contract Type", strContractType);
        	CF.performTab(contractType_DrpDwn, 1);
        	Thread.sleep(4000);
        	CF.enterValues(primaryParty_DrpDwn, "Primary Party", strPrimaryParty);
        	//CF.selectValueFromDropDown(currency_DrpDwn, "Currency", strCurrency);
            CF.performTab(primaryParty_DrpDwn, 1);
        	Thread.sleep(1000);
        	 
        	CF.selectValueFromDropDown(AuthoringParty_DrpDwn1, "Authoring Party	", strAuthoringParty1);
          	wait.until(ExpectedConditions.visibilityOfElementLocated(saveAndContinue_Btn));
          	
        	CF.clickOnElement(saveAndContinue_Btn, "Save and Continue", "button");
        	
        	return new ERP_Contracts_Page(scriptHelper);
      }
        
        public ERP_Contracts_Page EnterAdditionalInformationForContracts() throws InterruptedException{
        	
        	String strOcwenContractGroup = dataTable.getData("General_Data", "OcwenContractGroup");
        	CF.enterValues(ocwenContractGroup_DrpDwn, "Ocwen Contract Group", strOcwenContractGroup);
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }
           
        /// Document addition function****
        
        public ERP_Contracts_Page AddContractsDoc() throws InterruptedException{
        	
        	String strFileLocation2 = dataTable.getData("General_Data", "FileLocation2");
        	CF.clickOnElement(Documents_lnk, "Documents", "link");
        	Thread.sleep(1000);
        	
        // Addition of Documents
        	
        	CF.clickOnElement(Add_Btn, "Add Docs", "Icon");
        	Thread.sleep(1000);
        	
        	CF.browseAndUploadFile(Browse2_Btn, strFileLocation2);
        	Thread.sleep(2000);
        	
        	CF.clickOnElement(Overview_lnk, "Overview", "link");
        	Thread.sleep(1000);
       
        // Deletion of documents
        	
        	CF.clickOnElement(Documents_lnk, "Documents", "link");
        	wait.until(ExpectedConditions.visibilityOfElementLocated(Delete_btn));
        	CF.clickOnElement(Delete_btn, "Delete Docs", "Icon");
        	wait.until(ExpectedConditions.visibilityOfElementLocated(Yes_btn));
        	CF.clickOnElement(Yes_btn, "Yes", "button");
        	Thread.sleep(1000);
        	
        	
        	
        	return new ERP_Contracts_Page(scriptHelper);
       
        }
        
        public ERP_Contracts_Page AddLinesToContract() throws InterruptedException{
        	
        	String strName = dataTable.getData("General_Data", "Name");
        	
        	CF.clickOnElement(lines_Lnk, "Lines", "link");
        	CF.clickOnElement(addLines_Icon, "Add Lines", "Icon");
        	Thread.sleep(2000);
        	CF.enterValuesInTextBox(nameOnCreateLine_TxtBox, "Name", strName);
        	CF.clickOnElement(ok_Btn, "Ok", "button");
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }
           /* Suraj added new function*/
        
     
        public ERP_Contracts_Page AddLineamountTerms() throws InterruptedException{
        	
    	  
        	String strUOM = dataTable.getData("General_Data", "UOM");
        	String strUnitPrice = dataTable.getData("General_Data", "Unit Price");
        	String strLineQuantity = dataTable.getData("General_Data", "Line Quantity");
        	 
            CF.enterValues(UOM_DrpDwn, "UOM", strUOM);
            Thread.sleep(1000);
            CF.enterValuesInTextBox(UnitPrice_TxtBox, "Unit Price", strUnitPrice);
            Thread.sleep(1000);
            driver.findElement(By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:0:HomeApplicationPanel:pt_r8:0:pldFlow:2:numOfItemId::content")).click();
            Thread.sleep(1000);
        	CF.enterValuesInTextBox(LineQuantity_TxtBox, "Line Quantity	", strLineQuantity);
        	 
        	  
        	return new ERP_Contracts_Page(scriptHelper);
        }
      
        /*End of new addition*/
      
 public ERP_Contracts_Page AddContractTerms() throws InterruptedException{
        	
        	String strAuthoringParty2 = dataTable.getData("General_Data", "AuthoringParty2"); // suraj added
        	//String strContractSource = dataTable.getData("General_Data", "ContractSource"); suraj removed
        	String strFileLocation = dataTable.getData("General_Data", "BrowseLocation");
        	Thread.sleep(2000);
        	CF.clickOnElement(contractTerms_Lnk, "Contract Terms", "link");
        	Thread.sleep(2000);
        	CF.clickOnElement(addContractsTerms_Btn, "Add Contract Terms", "button");
        	Thread.sleep(2000);
        	CF.selectValueFromDropDown(AuthorityParty2_DrpDwn, "Authoring Party", strAuthoringParty2);//Suraj added
        	//CF.selectValueFromDropDown(contractSource_DrpDwn, "Contract Source", strContractSource);
        	Thread.sleep(2000);
        	CF.browseAndUploadFile(browse_Btn, strFileLocation);
        	Thread.sleep(2000);
        	CF.clickOnElement(okOnAddContractsTersms_Btn, "OK", "button");
        	
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }
        
        public ERP_Contracts_Page GetContractsNumber() throws InterruptedException{
        	//15//21
        	
        	report.updateTestLog("Get Contract number", "Contract number is: "+CF.getValue(contractNumber_Wel, 15, 22), Status.PASS);
        	return new ERP_Contracts_Page(scriptHelper);
        }
        
        public ERP_Contracts_Page InitalSubmitContract() throws InterruptedException{
       	
       	  CF.clickOnElement(submit_Btn, "Submit", "button");
       	 
       	  return new ERP_Contracts_Page(scriptHelper);
         }
        
        public ERP_Contracts_Page ErrorInContract() throws InterruptedException{
           	
        	String strError;
        	strError = CF.getText(error_Wel);
        	if (strError.contains("0")){
        		report.updateTestLog("Verify any errors in contract", "No errors in contract", Status.PASS);
        		CF.clickOnElement(next_Btn, "Next", "button");
        	}
        	else
        	{
        		report.updateTestLog("Verify any errors in contract", strError + ": errors in contract", Status.FAIL);
        	}
         	  
         	  return new ERP_Contracts_Page(scriptHelper);
           }
        
        public ERP_Contracts_Page NoteToApprover() throws InterruptedException{
        	String strNoteToApprover = dataTable.getData("General_Data", "NoteToApprover");
        	
        	CF.enterValuesInTextBox(approve_TxtBox, "Note to approver", strNoteToApprover);
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }
        
        
    //**************************Addition of Approver***********************************************
        
        public ERP_Contracts_Page AddApprover() throws InterruptedException{
        	
        	
        	String strUsername = dataTable.getData("General_Data", "User");
        	String strUsername1 = dataTable.getData("General_Data", "User1");
        	
        	
        	CF.clickOnElement(ApproveArrow_btn, "Add Approver", "Icon");
        	Thread.sleep(1000);
        	CF.clickOnElement(Approver1_Opt, "Approver Option", "Frame");
        	Thread.sleep(1000);
        	CF.clickOnElement(AddApprover_icon, "Approver Icon", "Icon");
        	Thread.sleep(1000);
        	CF.enterValuesInTextBox(User_Inpt, "User",strUsername );
        	Thread.sleep(1000);
        	CF.clickOnElement(Ok2_Btn, "Ok", "button");
        	Thread.sleep(1000);
        	CF.clickOnElement(Apply_Btn, "Apply", "Button");
        	Thread.sleep(2000);
        	CF.clickOnElement(ApproverScroll_Btn, "Option", "button");
        	Thread.sleep(1000);
        	//driver.getPageSource().contains(strUsername1)
        	
        	//driver.findElement(By.xpath(".//*[contains(text(),'"+ strUsername1 +"')]")).isDisplayed();
        	//driver.findElement(By.id("pt1:USma:0:MAnt2:1:pt1:pt_r1:2:AP1:r1:0:taskhistory:j_id__ctru10pc16")).getText().equalsIgnoreCase(strUsername1)
        	
        	
        	if(driver.findElement(By.xpath(".//*[contains(text(),'"+ strUsername1 +"')]")).isDisplayed())
        	{
        	    report.updateTestLog("Check Approver Name", "The approver : "+strUsername1 +" is successfully added and displayed", Status.PASS);
        	}

        	else
        	{
        		report.updateTestLog("Check Approver Name", "The approver : "+strUsername1 +" does not exist", Status.FAIL);
        	}
        	return new ERP_Contracts_Page(scriptHelper);
        }
       
        
       
        public ERP_Contracts_Page FinalContractSubmit() throws InterruptedException{
        	
        	CF.clickOnElement(submitFinal_Btn, "Submit", "button");
        	Thread.sleep(10000);
        	return new ERP_Contracts_Page(scriptHelper);
        }
        
        public ERP_Contracts_Page ValidateContractDetailsInContractSummary() throws InterruptedException{
        	
        	String strContractStatus;
        	
        	strContractStatus = CF.getText(contractStatus_Wel);
        	if (strContractStatus.contains("Pending approval")){
        		report.updateTestLog("Verify contracts status", "Contract status is : "+strContractStatus, Status.PASS);
        		/*CF.clickOnElement(cancel_Btn, "Cancel", "button");
        		Thread.sleep(4000);
        		*/
        	}
        	else{
        		report.updateTestLog("Verify contracts status", "Contract status is not 'Pending approval' but it is : "+strContractStatus, Status.FAIL);
        	}
        	return new ERP_Contracts_Page(scriptHelper);
        }
        
        
  
        
       public ERP_Contracts_Page AmendContract() throws InterruptedException{
	  
		  String strNoteToApprover1 = dataTable.getData("General_Data", "NoteToApprover");
		  String strItemmaster = dataTable.getData("General_Data", "Item Master");
		  String strReason = dataTable.getData("General_Data", "Reason");
	        	
        	CF.clickOnElement(saveArrow_drpdwn, "Arrow", "button");
        	//Thread.sleep(1000);
        	CF.clickOnElement(saveandclose_opt, "Save and Close", "button");
        	Thread.sleep(1000);
        	CF.clickOnElement(contract1_lnk, "Contracts", "link");
        	Thread.sleep(1000);
        	CF.clickOnElement(pendingcontract_lnk, "Contracts", "link");
        	Thread.sleep(1000);
        	
        	CF.clickOnElement(Action_drpdwn, "Arrow", "button");
        	Thread.sleep(1000);
        	CF.clickOnElement(Stopvalidation_opt, "Stop Approval", "link");
        	Thread.sleep(1000);
        	CF.clickOnElement(Stopvalidation_btn, "Ok", "Button");
        	Thread.sleep(2000);
        	
        	CF.enterValues(Itemmaster_inputbx, "Item Master", strItemmaster);
        	Thread.sleep(1000);
        	//CF.clickOnElement(Save_btn, "Save", "Button");
        	//Thread.sleep(2000);
        	
        	CF.clickOnElement(Submit1_btn, "Submit", "Button");
        	Thread.sleep(1000);
        //	wait.until(ExpectedConditions.visibilityOfElementLocated(Next1_btn));
        	CF.clickOnElement(Next1_btn, "Next", "Button");
        	Thread.sleep(1000);
        //	wait.until(ExpectedConditions.visibilityOfElementLocated(Input1_Txtbx));
        	CF.enterValuesInTextBox(Input1_Txtbx, "Note to Approver", strNoteToApprover1);
        	Thread.sleep(1000);
        //	wait.until(ExpectedConditions.visibilityOfElementLocated(Submit2_btn));
        	CF.clickOnElement(Submit2_btn, "Submit", "Button");
        	Thread.sleep(1000);
        	
        	
        	CF.clickOnElement(Action_drpdwn, "Arrow", "button");
        	Thread.sleep(1000); 
        	CF.clickOnElement(Cancel_opt, "Cancel", "button");
        	Thread.sleep(1000); 
        	CF.selectValueFromDropDown(Reason_input, "Reason", strReason);
        	Thread.sleep(1000); 
        	//CF.clickOnElement(Cancel1_btn, "Cancel", "button");
        	//Thread.sleep(1000);
            CF.clickOnElement(SaveAndClose_btn, "Save and Close", "button");
        	
        	Thread.sleep(3000);
        
        	/*String strContractStatus1;
        	
        	strContractStatus1 = CF.getText(contractStatus_Wel);
        	
        	if (strContractStatus1.contains("Canceled")){
        		
        		report.updateTestLog("Verify contracts status", "Contract status is : "+strContractStatus1, Status.PASS);
        	 
        	}
        	else{
        		report.updateTestLog("Verify contracts status", "Contract status is not 'Canceled' but it is : "+strContractStatus1, Status.FAIL);
        	}
        	 */
        	
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }
  
  
 
     public ERP_Contracts_Page cancelContracts()  throws InterruptedException{
	  
	  
	 // String strItemmaster = dataTable.getData("General_Data", "Item Master");
	  String strReason = dataTable.getData("General_Data", "Reason");
        	
        	/*CF.clickOnElement(saveArrow_drpdwn, "Arrow", "button");
        	//Thread.sleep(1000);
        	CF.clickOnElement(saveandclose_opt, "Save and Close", "button");
        	Thread.sleep(1000);
        	CF.clickOnElement(contract1_lnk, "Contracts", "link");
        	Thread.sleep(1000);
        	CF.clickOnElement(pendingcontract_lnk, "Contracts", "link");
        	Thread.sleep(1000);*/
        	
        	CF.clickOnElement(Action_drpdwn, "Arrow", "button");
        	Thread.sleep(1000);
        	CF.clickOnElement(Stopvalidation_opt, "Stop Approval", "link");
        	Thread.sleep(1000);
        	CF.clickOnElement(Stopvalidation_btn, "Ok", "Button");
        	Thread.sleep(2000);
        	
        	//CF.enterValues(Itemmaster_inputbx, "Item Master", strItemmaster);
        	//Thread.sleep(1000);
        	//CF.clickOnElement(Save_btn, "Save", "Button");
        	//Thread.sleep(1000);
        	CF.clickOnElement(Action_drpdwn, "Arrow", "button");
        	Thread.sleep(1000); 
        	CF.clickOnElement(Cancel_opt, "Cancel", "button");
        	Thread.sleep(1000); 
        	CF.selectValueFromDropDown(Reason_input, "Reason", strReason);
        	Thread.sleep(1000); 
        	CF.clickOnElement(SaveAndClose_btn, "Save and Close", "button");
        	
        	Thread.sleep(3000);
        
        	/*String strContractStatus1;
        	
        	strContractStatus1 = CF.getText(contractStatus_Wel);
        	
        	if (strContractStatus1.contains("Canceled")){
        		
        		report.updateTestLog("Verify contracts status", "Contract status is : "+strContractStatus1, Status.PASS);
        	 
        	}
        	else{
        		report.updateTestLog("Verify contracts status", "Contract status is not 'Canceled' but it is : "+strContractStatus1, Status.FAIL);
        	}*/
        	 
        	
        	
        	return new ERP_Contracts_Page(scriptHelper);
        }      
  
 
        
    }
