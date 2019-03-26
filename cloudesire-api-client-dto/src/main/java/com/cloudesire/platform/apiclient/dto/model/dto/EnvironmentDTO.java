package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.PaymentGateway;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.Regexp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

@ApiModel( description = "Platform configuration" )
public class EnvironmentDTO extends DTO
{
    @ApiModelProperty( "The name of this environment" )
    @NotEmpty
    @Size( max = 255 )
    private String environmentName;

    @ApiModelProperty( "The name of the current chef environment" )
    @NotEmpty
    @Size( max = 255 )
    private String chefEnvironmentName;

    @ApiModelProperty( "The name of the mail environment" )
    @NotEmpty
    @Size( max = 255 )
    private String mailEnvironmentName = "defaultMailEnvironment";

    @ApiModelProperty( "The name of the store as it will appear in transactional emails" )
    @NotEmpty
    @Size( max = 255 )
    private String storeName;

    @ApiModelProperty( "The name of the support team, used in email signatures" )
    @NotEmpty
    @Size( max = 255 )
    private String teamName;

    @ApiModelProperty( "If this is the default environment" )
    private boolean defaultEnvironment = false;

    @ApiModelProperty( "The base URL of the frontend" )
    @NotEmpty
    @URL
    @Size( max = 2048 )
    private String frontendUrl;

    /**
     * Needs one `[[reseller]]` placeholder.
     */
    @ApiModelProperty( "Pattern generating frontend URLs for a reseller" )
    @NotEmpty
    private String frontendResellerPattern;

    @ApiModelProperty( "Patterns to generate links to the frontend" )
    @Valid
    private UrlPatterns urlPatterns;

    @ApiModelProperty( "Email where to send platform operations notifications" )
    @NotEmpty
    @Email
    private String operationGroup;

    @ApiModelProperty( "Email of the team" )
    @NotEmpty
    @Email
    private String notificationGroup;

    @ApiModelProperty( "Sender name of all the emails generated" )
    @NotEmpty
    @Size( max = 255 )
    private String mailSenderName;

    @ApiModelProperty( "Sender email of all the emails generated" )
    @NotEmpty
    @Email
    private String mailSenderAddress;

    @ApiModelProperty( "Tag added into the subject for all outgoing emails" )
    @Size( max = 20 )
    private String mailSubjectTag;

    @ApiModelProperty( "URL of the logo of all outgoing emails" )
    @URL
    private String mailLogo;

    @ApiModelProperty( "Email palette colors" )
    @Valid
    private EmailPalette mailPalette = new EmailPalette();

    @ApiModelProperty( "Footer for all the emails" )
    @Size( max = 2048 )
    private String mailFooter;

    @ApiModelProperty( "Support email for customers" )
    @Email
    @NotEmpty
    private String supportMail;

    @ApiModelProperty( "SendGrid template id to use" )
    @NotEmpty
    @Size( max = 255 )
    private String sendGridTemplateID;

    @ApiModelProperty( "When using SendGrid for email delivery, enable sandbox mode to not actually deliver any emails")
    private boolean sendGridSandbox;

    @ApiModelProperty( "Section of default user values" )
    @NotNull
    @Valid
    private DefaultUserValues defaultUserValues;

    @ApiModelProperty( "Section for subscriptions alerts" )
    @NotNull
    @Valid
    private SubscriptionTerm subscriptionTerm;

    @ApiModelProperty( "Days after a customer cannot pay a subscription anymore" )
    private int daysAfterFirstPaymentExpires = 3;

    @ApiModelProperty( "Section for invoice alerts" )
    @NotNull
    @Valid
    private InvoiceSleepTerm invoiceTerm;

    @ApiModelProperty( "Email sent for registration" )
    @Valid
    @NotNull
    private MailCustomization registration = new MailCustomization();

    @ApiModelProperty( "Email sent for new invoices" )
    @Valid
    @NotNull
    private NotificationMailCustomization invoice = new NotificationMailCustomization();

    @ApiModelProperty( "Email sent for paid invoices" )
    @Valid
    @NotNull
    private MailCustomization invoicePaid = new MailCustomization();

    @ApiModelProperty( "Email sent when user must set password for the first time" )
    @Valid
    @NotNull
    private MailCustomization passwordSet = new MailCustomization();

    @ApiModelProperty( "Email sent when starting password recovery procedure" )
    @Valid
    @NotNull
    private MailCustomization passwordRecovery = new MailCustomization();

    @ApiModelProperty( "Email sent when password set procedure completes" )
    @Valid
    @NotNull
    private MailCustomization passwordSetDone = new MailCustomization();

    @ApiModelProperty( "Email sent when password recovery procedure completes" )
    @Valid
    @NotNull
    private MailCustomization passwordRecoveryDone = new MailCustomization();

    @ApiModelProperty( "Email sent for new orders" )
    @Valid
    @NotNull
    private NotificationMailCustomization orderNotifier = new NotificationMailCustomization();

    @ApiModelProperty( "Email sent for orders direct to deployer" )
    @Valid
    @NotNull
    private NotificationMailCustomization orderCreation = new NotificationMailCustomization();

    @ApiModelProperty( "Email sent on every new order creation to vendor" )
    @Valid
    @NotNull
    private MailCustomization orderCreationVendor = new MailCustomization();

    @ApiModelProperty( "Email sent to the customer when application has been undeployed" )
    @Valid
    @NotNull
    private NotificationMailCustomization orderUndeployCustomer = new NotificationMailCustomization();

    @ApiModelProperty( "Email sent to the vendor when application has been undeployed" )
    @Valid
    @NotNull
    private MailCustomization orderUndeployVendor = new MailCustomization();

    @ApiModelProperty( "Email sent when deploy go wrong" )
    @Valid
    @NotNull
    private MailCustomization deployFailed = new MailCustomization();

    @ApiModelProperty( "Email sent to the vendor when deployment is completed" )
    @Valid
    @NotNull
    private MailCustomization deployCompleteVendor = new MailCustomization();

    @ApiModelProperty( "Email sent to the vendor when deployment is completed but needs post configuration" )
    @Valid
    @NotNull
    private MailCustomization deployCompleteWithPostConfigurationVendor = new MailCustomization();

    @ApiModelProperty( "Email sent to the customer when deployment is completed" )
    @Valid
    @NotNull
    private NotificationMailCustomization deployCompleteCustomer = new NotificationMailCustomization();

    @ApiModelProperty( "Email sent to the configured addresses when a vendor request an approval for changes of a product" )
    @Valid
    @NotNull
    private MailCustomization approvalRequest = new MailCustomization();

    @ApiModelProperty( "Email sent to the vendor of a subscription stuck in pending state" )
    @Valid
    @NotNull
    private MailCustomization stuckSubscription = new MailCustomization();

    @ApiModelProperty( "Sent when subscription is reaching end date" )
    @Valid
    @NotNull
    private MailCustomization subscriptionTermAlarm = new MailCustomization();

    @ApiModelProperty( "Email sent to the vendor when his account is approved" )
    @Valid
    @NotNull
    private MailCustomization vendorApproval = new MailCustomization();

    @ApiModelProperty( "Email containing vendor data" )
    @Valid
    @NotNull
    private MailCustomization vendorApprovalData = new MailCustomization();

    @ApiModelProperty( "Email sent on product approval to the company" )
    @Valid
    @NotNull
    private MailCustomization productApproval = new MailCustomization();

    @ApiModelProperty( "Email sent on product approval containing product data" )
    @Valid
    @NotNull
    private MailCustomization productApprovalData = new MailCustomization();

    @ApiModelProperty( "Email sent on vendor registration" )
    @Valid
    @NotNull
    private MailCustomization vendorRegistration = new MailCustomization();

    @ApiModelProperty( "Email sent on vendor registration to admin(s)" )
    @Valid
    @NotNull
    private MailCustomization vendorRegistrationNotification = new MailCustomization();

    @ApiModelProperty( "Vendor proceeds report" )
    @Valid
    @NotNull
    private MailCustomization vendorReport = new MailCustomization();

    @ApiModelProperty( "Reminders before the sleep term, warn the user to pay" )
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceReminder = new NotificationMailCustomization();
    @ApiModelProperty( "Alert to inform the user that the subscription has been put to sleep" )
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceSleep = new NotificationMailCustomization();
    @ApiModelProperty( "Alert to inform the user that the subscription has been destroyed" )
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceDeath = new NotificationMailCustomization();

    @ApiModelProperty( "Features section" )
    @Valid
    private FeaturesEnvironment features;

    @ApiModelProperty( "Configuration section" )
    @Valid
    private ConfigurationEnvironment configuration;

    //region Auto-generated getters and setters
    public FeaturesEnvironment getFeatures()
    {
        return features;
    }

    public void setFeatures( FeaturesEnvironment features )
    {
        this.features = features;
    }

    public ConfigurationEnvironment getConfiguration()
    {
        return configuration;
    }

    public void setConfiguration( ConfigurationEnvironment configuration )
    {
        this.configuration = configuration;
    }

    public String getMailSenderName()
    {
        return mailSenderName;
    }

    public void setMailSenderName( String mailSenderName )
    {
        this.mailSenderName = mailSenderName;
    }

    public String getMailSenderAddress()
    {
        return mailSenderAddress;
    }

    public void setMailSenderAddress( String mailSenderAddress )
    {
        this.mailSenderAddress = mailSenderAddress;
    }

    public String getMailSubjectTag()
    {
        return mailSubjectTag;
    }

    public void setMailSubjectTag( String mailSubjectTag )
    {
        this.mailSubjectTag = mailSubjectTag;
    }

    public String getMailLogo()
    {
        return mailLogo;
    }

    public void setMailLogo( String mailLogo )
    {
        this.mailLogo = mailLogo;
    }

    public EmailPalette getMailPalette()
    {
        return mailPalette;
    }

    public void setMailPalette( EmailPalette mailPalette )
    {
        this.mailPalette = mailPalette;
    }

    public String getMailFooter()
    {
        return mailFooter;
    }

    public void setMailFooter( String mailFooter )
    {
        this.mailFooter = mailFooter;
    }

    public String getSupportMail()
    {
        return supportMail;
    }

    public void setSupportMail( String supportMail )
    {
        this.supportMail = supportMail;
    }

    public MailCustomization getDeployCompleteCustomer()
    {
        return deployCompleteCustomer;
    }

    public void setDeployCompleteCustomer( NotificationMailCustomization deployCompleteCustomer )
    {
        this.deployCompleteCustomer = deployCompleteCustomer;
    }

    public MailCustomization getApprovalRequest()
    {
        return approvalRequest;
    }

    public void setApprovalRequest( MailCustomization approvalRequest )
    {
        this.approvalRequest = approvalRequest;
    }

    public MailCustomization getDeployFailed()
    {
        return deployFailed;
    }

    public void setDeployFailed( MailCustomization deployFailed )
    {
        this.deployFailed = deployFailed;
    }

    public MailCustomization getDeployCompleteVendor()
    {
        return deployCompleteVendor;
    }

    public void setDeployCompleteVendor( MailCustomization deployCompleteVendor )
    {
        this.deployCompleteVendor = deployCompleteVendor;
    }

    public MailCustomization getDeployCompleteWithPostConfigurationVendor()
    {
        return deployCompleteWithPostConfigurationVendor;
    }

    public void setDeployCompleteWithPostConfigurationVendor(
            MailCustomization deployCompleteWithPostConfigurationVendor )
    {
        this.deployCompleteWithPostConfigurationVendor = deployCompleteWithPostConfigurationVendor;
    }

    public InvoiceSleepTerm getInvoiceTerm()
    {
        return invoiceTerm;
    }

    public void setInvoiceTerm( InvoiceSleepTerm ist )
    {
        invoiceTerm = ist;
    }

    public SubscriptionTerm getSubscriptionTerm()
    {
        return subscriptionTerm;
    }

    public void setSubscriptionTerm( SubscriptionTerm subscriptionTerm )
    {
        this.subscriptionTerm = subscriptionTerm;
    }

    public int getDaysAfterFirstPaymentExpires()
    {
        return daysAfterFirstPaymentExpires;
    }

    public void setDaysAfterFirstPaymentExpires( int daysAfterFirstPaymentExpires )
    {
        this.daysAfterFirstPaymentExpires = daysAfterFirstPaymentExpires;
    }

    public MailCustomization getRegistration()
    {
        return registration;
    }

    public void setRegistration( MailCustomization registration )
    {
        this.registration = registration;
    }

    public MailCustomization getInvoice()
    {
        return invoice;
    }

    public void setInvoice( NotificationMailCustomization invoice )
    {
        this.invoice = invoice;
    }

    public MailCustomization getInvoicePaid()
    {
        return invoicePaid;
    }

    public void setInvoicePaid( MailCustomization invoicePaid )
    {
        this.invoicePaid = invoicePaid;
    }

    public MailCustomization getPasswordSet()
    {
        return passwordSet;
    }

    public void setPasswordSet( MailCustomization passwordSet )
    {
        this.passwordSet = passwordSet;
    }

    public MailCustomization getPasswordRecovery()
    {
        return passwordRecovery;
    }

    public void setPasswordRecovery( MailCustomization passwordRecovery )
    {
        this.passwordRecovery = passwordRecovery;
    }

    public MailCustomization getPasswordSetDone()
    {
        return passwordSetDone;
    }

    public void setPasswordSetDone( MailCustomization passwordSetDone )
    {
        this.passwordSetDone = passwordSetDone;
    }

    public MailCustomization getPasswordRecoveryDone()
    {
        return passwordRecoveryDone;
    }

    public void setPasswordRecoveryDone( MailCustomization passwordRecoveryDone )
    {
        this.passwordRecoveryDone = passwordRecoveryDone;
    }

    public NotificationMailCustomization getOrderNotifier()
    {
        return orderNotifier;
    }

    public void setOrderNotifier( NotificationMailCustomization orderNotifier )
    {
        this.orderNotifier = orderNotifier;
    }

    public NotificationMailCustomization getOrderCreation()
    {
        return orderCreation;
    }

    public void setOrderCreation( NotificationMailCustomization orderCreation )
    {
        this.orderCreation = orderCreation;
    }

    public MailCustomization getOrderCreationVendor()
    {
        return orderCreationVendor;
    }

    public void setOrderCreationVendor( MailCustomization orderCreationVendor )
    {
        this.orderCreationVendor = orderCreationVendor;
    }

    public NotificationMailCustomization getOrderUndeployCustomer()
    {
        return orderUndeployCustomer;
    }

    public void setOrderUndeployCustomer( NotificationMailCustomization orderUndeployCustomer )
    {
        this.orderUndeployCustomer = orderUndeployCustomer;
    }

    public MailCustomization getOrderUndeployVendor()
    {
        return orderUndeployVendor;
    }

    public void setOrderUndeployVendor( MailCustomization orderUndeployVendor )
    {
        this.orderUndeployVendor = orderUndeployVendor;
    }

    public DefaultUserValues getDefaultUserValues()
    {
        return defaultUserValues;
    }

    public void setDefaultUserValues( DefaultUserValues defaultUserValues )
    {
        this.defaultUserValues = defaultUserValues;
    }

    public String getMailEnvironmentName()
    {
        return mailEnvironmentName;
    }

    public void setMailEnvironmentName( String mailEnvironmentName )
    {
        this.mailEnvironmentName = mailEnvironmentName;
    }

    public String getEnvironmentName()
    {
        return environmentName;
    }

    public void setEnvironmentName( String environmentName )
    {
        this.environmentName = environmentName;
    }

    public String getStoreName()
    {
        return storeName;
    }

    public void setStoreName( String storeName )
    {
        this.storeName = storeName;
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName( String teamName )
    {
        this.teamName = teamName;
    }

    public String getSendGridTemplateID()
    {
        return sendGridTemplateID;
    }

    public void setSendGridTemplateID( String sendGridTemplateID )
    {
        this.sendGridTemplateID = sendGridTemplateID;
    }

    public Boolean getDefaultEnvironment()
    {
        return defaultEnvironment;
    }

    public void setDefaultEnvironment( Boolean defaultEnvironment )
    {
        this.defaultEnvironment = defaultEnvironment;
    }

    public String getFrontendUrl()
    {
        return frontendUrl;
    }

    public void setFrontendUrl( String frontendUrl )
    {
        this.frontendUrl = frontendUrl;
    }

    public String getFrontendResellerPattern()
    {
        return frontendResellerPattern;
    }

    public void setFrontendResellerPattern( String frontendResellerPattern )
    {
        this.frontendResellerPattern = frontendResellerPattern;
    }

    public UrlPatterns getUrlPatterns()
    {
        return urlPatterns;
    }

    public void setUrlPatterns( UrlPatterns urlPatterns )
    {
        this.urlPatterns = urlPatterns;
    }

    public String getNotificationGroup()
    {
        return notificationGroup;
    }

    public void setNotificationGroup( String notificationGroup )
    {
        this.notificationGroup = notificationGroup;
    }

    public String getOperationGroup()
    {
        return operationGroup;
    }

    public void setOperationGroup( String operationGroup )
    {
        this.operationGroup = operationGroup;
    }

    public MailCustomization getStuckSubscription()
    {
        return stuckSubscription;
    }

    public void setStuckSubscription( MailCustomization stuckSubscription )
    {
        this.stuckSubscription = stuckSubscription;
    }

    public MailCustomization getVendorApproval()
    {
        return vendorApproval;
    }

    public void setVendorApproval( MailCustomization vendorApproval )
    {
        this.vendorApproval = vendorApproval;
    }

    public MailCustomization getVendorApprovalData()
    {
        return vendorApprovalData;
    }

    public void setVendorApprovalData( MailCustomization vendorApprovalData )
    {
        this.vendorApprovalData = vendorApprovalData;
    }

    public MailCustomization getProductApproval()
    {
        return productApproval;
    }

    public void setProductApproval( MailCustomization productApproval )
    {
        this.productApproval = productApproval;
    }

    public MailCustomization getProductApprovalData()
    {
        return productApprovalData;
    }

    public void setProductApprovalData( MailCustomization productApprovalData )
    {
        this.productApprovalData = productApprovalData;
    }

    public MailCustomization getVendorRegistration()
    {
        return vendorRegistration;
    }

    public void setVendorRegistration( MailCustomization vendorRegistration )
    {
        this.vendorRegistration = vendorRegistration;
    }

    public MailCustomization getVendorRegistrationNotification()
    {
        return vendorRegistrationNotification;
    }

    public void setVendorRegistrationNotification( MailCustomization vendorRegistrationNotification )
    {
        this.vendorRegistrationNotification = vendorRegistrationNotification;
    }

    public MailCustomization getVendorReport()
    {
        return vendorReport;
    }

    public void setVendorReport( MailCustomization vendorReport )
    {
        this.vendorReport = vendorReport;
    }

    public NotificationMailCustomization getInvoiceReminder()
    {
        return invoiceReminder;
    }

    public void setInvoiceReminder( NotificationMailCustomization invoiceReminder )
    {
        this.invoiceReminder = invoiceReminder;
    }

    public NotificationMailCustomization getInvoiceSleep()
    {
        return invoiceSleep;
    }

    public void setInvoiceSleep( NotificationMailCustomization invoiceSleep )
    {
        this.invoiceSleep = invoiceSleep;
    }

    public NotificationMailCustomization getInvoiceDeath()
    {
        return invoiceDeath;
    }

    public void setInvoiceDeath( NotificationMailCustomization invoiceDeath )
    {
        this.invoiceDeath = invoiceDeath;
    }

    public MailCustomization getSubscriptionTermAlarm()
    {
        return subscriptionTermAlarm;
    }

    public void setSubscriptionTermAlarm( MailCustomization subscriptionTermAlarm )
    {
        this.subscriptionTermAlarm = subscriptionTermAlarm;
    }

    public String getChefEnvironmentName()
    {
        return chefEnvironmentName;
    }

    public void setChefEnvironmentName( String chefEnvironmentName )
    {
        this.chefEnvironmentName = chefEnvironmentName;
    }

    public boolean getSendGridSandbox()
    {
        return sendGridSandbox;
    }

    public void setSendGridSandbox( boolean sendGridSandbox )
    {
        this.sendGridSandbox = sendGridSandbox;
    }
    //endregion

    @ApiModel( description = "Default attributes for new users" )
    public static class DefaultUserValues
    {
        @ApiModelProperty( "Enabled flag default value" )
        private boolean isEnabled;

        @ApiModelProperty( "Active flag default value" )
        private boolean isActive;

        @ApiModelProperty( "TermsAccepted flag default value" )
        private boolean termsAccepted;

        @ApiModelProperty( "Activate old account if not active when recreating account" )
        private boolean canBeReactivated;

        //region Auto-generated getters and setters
        public boolean getIsEnabled()
        {
            return isEnabled;
        }

        public void setIsEnabled( boolean isEnabled )
        {
            this.isEnabled = isEnabled;
        }

        public boolean getIsActive()
        {
            return isActive;
        }

        public void setIsActive( boolean isActive )
        {
            this.isActive = isActive;
        }

        public boolean getTermsAccepted()
        {
            return termsAccepted;
        }

        public void setTermsAccepted( boolean termsAccepted )
        {
            this.termsAccepted = termsAccepted;
        }

        public boolean getCanBeReactivated()
        {
            return canBeReactivated;
        }

        public void setCanBeReactivated( boolean canBeReactivated )
        {
            this.canBeReactivated = canBeReactivated;
        }
        //endregion
    }

    @ApiModel( description = "Email palette attributes" )
    public static class EmailPalette
    {
        @NotEmpty
        @Pattern( regexp = Regexp.HEX_COLOR_LOWERCASE )
        private String primaryColor = "#0277bd";

        @NotEmpty
        @Pattern( regexp = Regexp.HEX_COLOR_LOWERCASE )
        private String textOnPrimaryColor = "#fff";

        @NotEmpty
        @Pattern( regexp = Regexp.HEX_COLOR_LOWERCASE )
        private String textColor = "#2f3133";

        @NotEmpty
        @Pattern( regexp = Regexp.HEX_COLOR_LOWERCASE )
        private String textLightColor = "#74787e";

        @NotEmpty
        @Pattern( regexp = Regexp.HEX_COLOR_LOWERCASE )
        private String linkColor = "#15c";

        public String getPrimaryColor()
        {
            return primaryColor;
        }

        public void setPrimaryColor( String primaryColor )
        {
            this.primaryColor = primaryColor;
        }

        public String getTextOnPrimaryColor()
        {
            return textOnPrimaryColor;
        }

        public void setTextOnPrimaryColor( String textOnPrimaryColor )
        {
            this.textOnPrimaryColor = textOnPrimaryColor;
        }

        public String getTextColor()
        {
            return textColor;
        }

        public void setTextColor( String textColor )
        {
            this.textColor = textColor;
        }

        public String getTextLightColor()
        {
            return textLightColor;
        }

        public void setTextLightColor( String textLightColor )
        {
            this.textLightColor = textLightColor;
        }

        public String getLinkColor()
        {
            return linkColor;
        }

        public void setLinkColor( String linkColor )
        {
            this.linkColor = linkColor;
        }

        //endregion
    }

    @ApiModel( description = "An instance of email template to be sent at certain events" )
    public static class MailCustomization
    {
        public static final String DEFAULT_MAIL_LANGUAGE = "it";

        @ApiModelProperty( "Should send emails of this type" )
        private boolean serviceEnable = true;

        @ApiModelProperty( "The recipients to send these emails to" )
        private List<String> to;

        @ApiModelProperty( "The language in which this email will be rendered" )
        private String language;

        @ApiModelProperty( "Template parameter overrides" )
        private Map<String, String> parameters = new HashMap<>();

        @JsonIgnore
        public boolean getServiceEnable( boolean userSubscribed )
        {
            return getServiceEnable();
        }

        @JsonIgnore
        public boolean getServiceEnable( boolean userSubscribed, OrderType orderType )
        {
            return getServiceEnable() && ! OrderType.UNMANAGED.equals( orderType );
        }

        //region Auto-generated getters and setters

        public boolean getServiceEnable()
        {
            return serviceEnable;
        }

        public void setServiceEnable( boolean serviceEnable )
        {
            this.serviceEnable = serviceEnable;
        }

        public List<String> getTo()
        {
            return to;
        }

        public void setTo( List<String> to )
        {
            this.to = to;
        }

        public String getLanguage()
        {
            if ( language == null ) return DEFAULT_MAIL_LANGUAGE;
            return language;
        }

        public void setLanguage( String language )
        {
            this.language = language;
        }

        public Map<String, String> getParameters()
        {
            return parameters;
        }

        public void setParameters( Map<String, String> parameters )
        {
            this.parameters = parameters;
        }
        //endregion
    }

    @ApiModel( description = "A non-transactional email notification from which user can unsubscribe" )
    public static class NotificationMailCustomization extends MailCustomization
    {
        @JsonIgnore
        @Override
        public boolean getServiceEnable( boolean userSubscribed )
        {
            return super.getServiceEnable() && userSubscribed;
        }

        @JsonIgnore
        @Override
        public boolean getServiceEnable( boolean userSubscribed, OrderType orderType )
        {
            return super.getServiceEnable( userSubscribed, orderType ) && userSubscribed;
        }
    }

    @ApiModel( description = "The emails to send when there are invoice with pending payment for customers" )
    public static class InvoiceSleepTerm
    {
        @ApiModelProperty( "Days after deadline, subscription will be set to sleeping" )
        @NotNull
        private Integer sleepDays = 2;

        @ApiModelProperty( "Days after sleep deadline, subscription will be undeployed" )
        @NotNull
        private Integer delayDays = 3;

        //region autogenerated
        public Integer getDelayDays()
        {
            return delayDays;
        }

        public void setDelayDays( Integer delayDays )
        {
            this.delayDays = delayDays;
        }

        public Integer getSleepDays()
        {
            return sleepDays;
        }

        public void setSleepDays( Integer sleepDays )
        {
            this.sleepDays = sleepDays;
        }
        //endregion
    }

    @ApiModel( description = "Fine tuning of subscription expiration behaviour")
    public static class SubscriptionTerm
    {
        /**
         * If 0 means that it's always possible to Renew subscriptions
         * If < 0 means that it's never possible to Renew subscriptions
         * If > 0 means the day before expiration that renew is possible
         */
        @ApiModelProperty( "How many days before expiration renewal is possibile" )
        private int daysLeftUntilExpirationForRenewal = -1;

        @ApiModelProperty( "List of days before expire to send email alerts about expiration" )
        @NotNull
        private Integer[] subscriptionTermAlertDays;

        //region Auto-generated getters and setters
        public int getDaysLeftUntilExpirationForRenewal()
        {
            return daysLeftUntilExpirationForRenewal;
        }

        public void setDaysLeftUntilExpirationForRenewal( int daysLeftUntilExpirationForRenewal )
        {
            this.daysLeftUntilExpirationForRenewal = daysLeftUntilExpirationForRenewal;
        }

        public Integer[] getSubscriptionTermAlertDays()
        {
            return subscriptionTermAlertDays;
        }

        public void setSubscriptionTermAlertDays( Integer[] subscriptionTermAlertDays )
        {
            Arrays.sort( subscriptionTermAlertDays, Collections.reverseOrder() );
            this.subscriptionTermAlertDays = subscriptionTermAlertDays;
        }
        //endregion
    }

    @ApiModel( description = "Features that can be toggled at runtime" )
    public static class FeaturesEnvironment
    {
        @ApiModelProperty( "Enables the creation of syndicated products" )
        private boolean syndicated = false;

        @ApiModelProperty( "Enables vendors to invoice customer on their own" )
        private SelfBilling selfBilling = SelfBilling.DISABLED;

        @ApiModelProperty( "Enables the usage of coupons" )
        private boolean coupon = true;

        @ApiModelProperty( "Enables uservoice widget" )
        private boolean uservoice = true;

        @ApiModelProperty( "Show the bandwidth" )
        private boolean showBandwidth = true;

        @ApiModelProperty( "Enables upgrading TRIAL subscriptions to NORMAL subscriptions" )
        private boolean upgradeToNormal = true;

        @ApiModelProperty( "Enable product revision" )
        private boolean productRevision = false;

        @ApiModelProperty( "Enable unmanaged orders" )
        private boolean unmanagedOrders;

        @ApiModelProperty( "Send product instructions to the customer on buy" )
        private boolean instructionsInEmail = false;

        @ApiModelProperty( "Permit links in end user instructions" )
        private LinksInEndUserInstructions linksInEndUserInstructions;

        @ApiModelProperty( "Add a legal notice into invoice footer required in Italy" )
        private boolean cashAccounting = true;

        @ApiModelProperty( "Validation for uploaded zip application files" )
        private boolean zipApplicationFileValidation = true;

        @ApiModelProperty( "Enables upload of file to the blob storage service" )
        private boolean blobStorageUpload;

        @ApiModelProperty( "The product types enabled for this environment" )
        private Set<ProductType> enabledProductTypes = EnumSet.allOf( ProductType.class );

        @ApiModelProperty( "Handle subscriptions via external service" )
        private ExternalSubscriptionHandling externalSubscriptionHandling;

        @ApiModelProperty( "Require approvation for customer subscriptions" )
        private boolean subscriptionApproval;

        @ApiModelProperty( "Require approvation for vendor creation" )
        private boolean vendorApproval;

        @ApiModelProperty( "Enables a bunch of additional fields in the user profile, often not required" )
        private boolean userProfileExtended;

        @ApiModelProperty( "VM backup available on the platform" )
        private boolean backup = true;

        @ApiModelProperty( "Enable selling extra resources" )
        private boolean billingItems = true;

        @ApiModelProperty( "Enabled payment gateways" )
        @Valid
        private List<PaymentGateway> enabledPaymentGateways = Collections.singletonList( PaymentGateway.STRIPE );

        @ApiModelProperty( "Customize reseller emails" )
        private boolean resellerMailCustomization;

        @ApiModelProperty( "Allow having more users per Distributor/Reseller company" )
        private boolean multipleParentChildUsers;

        @ApiModelProperty( "Enable Keycloak SSO" )
        private boolean keycloak;

        @ApiModelProperty( "Remove customer data from notifications" )
        private boolean gdpr;

        @ApiModelProperty( hidden = true )
        public boolean isZuoraEnabled()
        {
            return ExternalSubscriptionHandling.ZUORA.equals( externalSubscriptionHandling );
        }

        //region Auto-generated getters and setters
        public boolean isExternalSubscriptionHandling()
        {
            return externalSubscriptionHandling != null;
        }

        public boolean getSyndicated()
        {
            return syndicated;
        }

        public void setSyndicated( boolean syndicated )
        {
            this.syndicated = syndicated;
        }

        public SelfBilling getSelfBilling()
        {
            return selfBilling;
        }

        public void setSelfBilling( Object selfBilling )
        {
            /* @deprecated */
            if ( selfBilling instanceof Boolean && (Boolean) selfBilling )
            {
                this.selfBilling = SelfBilling.PER_PLAN;
            }

            if ( selfBilling instanceof String )
            {
                this.selfBilling = SelfBilling.valueOf( (String) selfBilling );
            }

            if ( selfBilling instanceof SelfBilling )
            {
                this.selfBilling = (SelfBilling) selfBilling;
            }
        }

        public boolean getCoupon()
        {
            return coupon;
        }

        public void setCoupon( boolean coupon )
        {
            this.coupon = coupon;
        }

        public boolean getUservoice()
        {
            return uservoice;
        }

        public void setUservoice( boolean uservoice )
        {
            this.uservoice = uservoice;
        }

        public boolean getShowBandwidth()
        {
            return showBandwidth;
        }

        public void setShowBandwidth( boolean showBandwidth )
        {
            this.showBandwidth = showBandwidth;
        }

        public boolean getUpgradeToNormal()
        {
            return upgradeToNormal;
        }

        public void setUpgradeToNormal( boolean upgradeToNormal )
        {
            this.upgradeToNormal = upgradeToNormal;
        }

        public boolean getProductRevision()
        {
            return productRevision;
        }

        public void setProductRevision( boolean productRevision )
        {
            this.productRevision = productRevision;
        }

        public boolean getUnmanagedOrders()
        {
            return unmanagedOrders;
        }

        public void setUnmanagedOrders( boolean unmanagedOrders )
        {
            this.unmanagedOrders = unmanagedOrders;
        }

        public boolean isInstructionsInEmail()
        {
            return instructionsInEmail;
        }

        public void setInstructionsInEmail( boolean instructionsInEmail )
        {
            this.instructionsInEmail = instructionsInEmail;
        }

        public LinksInEndUserInstructions getLinksInEndUserInstructions()
        {
            return linksInEndUserInstructions;
        }

        public void setLinksInEndUserInstructions( LinksInEndUserInstructions linksInEndUserInstructions )
        {
            this.linksInEndUserInstructions = linksInEndUserInstructions;
        }

        public boolean isCashAccounting()
        {
            return cashAccounting;
        }

        public void setCashAccounting( boolean cashAccounting )
        {
            this.cashAccounting = cashAccounting;
        }

        public boolean isZipApplicationFileValidation()
        {
            return zipApplicationFileValidation;
        }

        public void setZipApplicationFileValidation( boolean zipApplicationFileValidation )
        {
            this.zipApplicationFileValidation = zipApplicationFileValidation;
        }

        public boolean isBlobStorageUpload()
        {
            return blobStorageUpload;
        }

        public void setBlobStorageUpload( boolean blobStorageUpload )
        {
            this.blobStorageUpload = blobStorageUpload;
        }

        public Set<ProductType> getEnabledProductTypes()
        {
            return enabledProductTypes;
        }

        public void setEnabledProductTypes( Set<ProductType> enabledProductTypes )
        {
            this.enabledProductTypes.clear();
            if ( enabledProductTypes != null )
            {
                for ( ProductType enabledProductType : enabledProductTypes )
                {
                    addProductType( enabledProductType );
                }
            }
        }

        void addProductType( ProductType productType )
        {
            if ( productType != null ) this.enabledProductTypes.add( productType );
        }

        /**
         * @deprecated use {@link #setEnabledProductTypes(Set)}
         */
        @ApiModelProperty( hidden = true )
        @Deprecated
        public void setProductBundles( boolean productBundles )
        {
            if ( productBundles ) enabledProductTypes.add( ProductType.BUNDLE );
            else enabledProductTypes.remove( ProductType.BUNDLE );
        }

        public ExternalSubscriptionHandling getExternalSubscriptionHandling()
        {
            return externalSubscriptionHandling;
        }

        public void setExternalSubscriptionHandling( Object externalSubscriptionHandling )
        {
            /* @deprecated */
            if ( externalSubscriptionHandling instanceof Boolean )
            {
                if ( (Boolean) externalSubscriptionHandling )
                {
                    this.externalSubscriptionHandling = ExternalSubscriptionHandling.ZUORA;
                }
            }

            if ( externalSubscriptionHandling instanceof String )
            {
                this.externalSubscriptionHandling = ExternalSubscriptionHandling
                        .valueOf( (String) externalSubscriptionHandling );
            }

            if ( externalSubscriptionHandling instanceof ExternalSubscriptionHandling )
            {
                this.externalSubscriptionHandling = (ExternalSubscriptionHandling) externalSubscriptionHandling;
            }
        }

        public boolean isSubscriptionApproval()
        {
            return subscriptionApproval;
        }

        public void setSubscriptionApproval( boolean subscriptionApproval )
        {
            this.subscriptionApproval = subscriptionApproval;
        }

        public boolean isVendorApproval()
        {
            return vendorApproval;
        }

        public void setVendorApproval( boolean vendorApproval )
        {
            this.vendorApproval = vendorApproval;
        }

        public boolean isUserProfileExtended()
        {
            return userProfileExtended;
        }

        public void setUserProfileExtended( boolean userProfileExtended )
        {
            this.userProfileExtended = userProfileExtended;
        }

        public boolean isBackup()
        {
            return backup;
        }

        public void setBackup( boolean backup )
        {
            this.backup = backup;
        }

        public boolean isBillingItems()
        {
            return billingItems;
        }

        public void setBillingItems( boolean billingItems )
        {
            this.billingItems = billingItems;
        }

        public List<PaymentGateway> getEnabledPaymentGateways()
        {
            return enabledPaymentGateways;
        }

        public void setEnabledPaymentGateways( List<PaymentGateway> enabledPaymentGateways )
        {
            this.enabledPaymentGateways = enabledPaymentGateways;
        }

        public boolean isResellerMailCustomization()
        {
            return resellerMailCustomization;
        }

        public void setResellerMailCustomization( boolean resellerMailCustomization )
        {
            this.resellerMailCustomization = resellerMailCustomization;
        }

        public boolean isMultipleParentChildUsers()
        {
            return multipleParentChildUsers;
        }

        public void setMultipleParentChildUsers( boolean multipleParentChildUsers )
        {
            this.multipleParentChildUsers = multipleParentChildUsers;
        }

        public boolean isKeycloak()
        {
            return keycloak;
        }

        public void setKeycloak( boolean keycloak )
        {
            this.keycloak = keycloak;
        }

        public boolean isGdpr()
        {
            return gdpr;
        }

        public void setGdpr( boolean gdpr )
        {
            this.gdpr = gdpr;
        }

        public enum ExternalSubscriptionHandling
        {
            FASTWEB, ZUORA
        }

        public enum LinksInEndUserInstructions
        {
            FORBID, LOG;

            public boolean isForbidden()
            {
                return this.equals( FORBID );
            }
        }

        public enum SelfBilling
        {
            @ApiModelProperty( "Every invoice emitted is self billed" )
            ENABLED,

            @ApiModelProperty( "No invoice emitted is self billed" )
            DISABLED,

            @ApiModelProperty( "Invoices are emitted self billed according to vendor's plan or reseller's pricing" )
            PER_PLAN
        }
        //endregion
    }

    @ApiModel( description = "General configuration of the platform" )
    public static class ConfigurationEnvironment
    {
        // -1 means unlimited
        @ApiModelProperty( "Limit concurrent customer trial requests" )
        private int trialLimit = -1;

        @ApiModelProperty( "Default trials duration" )
        private int trialLengthInDays = 1;

        @ApiModelProperty( "Permit trials for bundles" )
        private boolean trialForBundles;

        @ApiModelProperty( "Default sandbox duration" )
        private int sandboxLengthInHour = 1;

        @NotNull
        @ApiModelProperty( "Percentage kept by platform owner set by default on new products" )
        private BigDecimal cloudesirePercentage = new BigDecimal( 15 );

        @ApiModelProperty( "The billingPeriods (how often customers receive invoices) a vendor can chose for its products" )
        @NotNull
        private List<Integer> customerInvoicePeriod = Arrays.asList( 1, 3, 6, 12, 24 );

        @ApiModelProperty( "Max available disk size when creating VMC" )
        private int diskSpaceLimit = 10000;

        @ApiModelProperty( "Default currency representation" )
        @NotEmpty
        @Size( max = 3 )
        private String currency = "EUR";

        @ApiModelProperty( "The address from which invoices are generated" )
        @Valid
        private AddressDTO platformAddress;

        /**
         * @deprecated by {@link #platformAddress}
         */
        @ApiModelProperty( "Default nation" )
        @Deprecated
        @Size( max = 2 )
        private String nation = "IT";

        @ApiModelProperty( "Enable validation of VAT ID for companies" )
        private boolean taxCodeValidation;

        @ApiModelProperty( "The default maximum number of published products for a newly created company" )
        private int companyMaxPublishedProducts = -1;

        @ApiModelProperty( "The available polling frequencies for metrics" )
        @NotNull
        @Valid
        private List<EntryDTO> metricFrequencyValues;

        @ApiModelProperty( "The cloud provider names enabled for this environment" )
        private List<String> enabledCloudProviders;

        @ApiModelProperty( "The product category names enabled for this environment" )
        private List<String> enabledCategories;

        @ApiModelProperty( "The product category names disabled for this environment" )
        private List<String> disabledCategories;

        @ApiModelProperty( "Anonymous user default country code" )
        @NotNull
        private String anonymousUserCountryCode;

        @ApiModelProperty( "End of the hostname generated. eg: apps.com" )
        @NotNull
        private String appsHostnameDomain;

        @ApiModelProperty( "Global syndication endpoints" )
        @Valid
        private List<SyndicationEndpointDTO> syndicationEndpoints;

        // Works as feature flag too (empty means disabled)
        @ApiModelProperty( "List of Slack Incoming Webhook to send platform notifications" )
        private List<String> slackNotificationEndpoints;

        @ApiModelProperty( "Slack channel that receives notifications" )
        @Size( max = 255 )
        private String slackChannel;

        @ApiModelProperty( "Send activation email on user creation" )
        @NotNull
        private Boolean sendActivationEmail;

        @ApiModelProperty( "Maximum size for uploaded files in bytes, a value < 1 disables check" )
        @NotNull
        private Long maxFileSize = 0L;

        @ApiModelProperty( "Content types of supported application files, null or empty disables feature" )
        private List<String> supportedApplicationFileTypes;

        @ApiModelProperty( "Content types of supported company and product images, null or empty disables feature" )
        private List<String> supportedCompanyLogoFileTypes;

        @ApiModelProperty( "Content types of supported file uploads, grouped by request type" )
        private Map<String, List<String>> supportedFileTypes;

        @ApiModelProperty( "Content types of supported public files, null or empty disables feature" )
        private List<String> supportedPublicUserFileTypes;

        @ApiModelProperty( "The VAT calculator on placed orders" )
        @NotNull
        private VatService vatService = VatService.INTERNAL;

        @ApiModelProperty( "If configured, every invoice line will have this VAT" )
        private BigDecimal customVat;

        @ApiModelProperty( "How many subscriptions to allow per-user for a product" )
        private SubscriptionsPerProduct subscriptionsPerProduct;

        @ApiModelProperty( "URLs for the CSP API connector per product type" )
        private Map<CspProductType, String> cspApiEndpoints;

        @ApiModelProperty( "The id of the current Azure pay-per-use CSP offer" )
        private String cspAzureProductId = "MS-AZR-0146P";

        @ApiModelProperty( "The code to use when autocreating the ConfigurationParameter for Azure CSP products" )
        private String cspAzureParameterCode = "DNS_PREFIX";

        @ApiModelProperty( "The identifier used when autocreating the BillingItem for licence CSP products" )
        private String cspLicenseIdentifier = "licenses";

        @ApiModelProperty( "The default destination for a CSP product" )
        private ProductDestination cspDefaultProductDestination = ProductDestination.B2B;

        @ApiModelProperty( "URLs for services" )
        @Valid
        private ServiceDirectory serviceDirectory = new ServiceDirectory();

        //region Auto-generated getters and setters
        public Integer getTrialLimit()
        {
            return trialLimit;
        }

        public void setTrialLimit( Integer trialLimit )
        {
            this.trialLimit = trialLimit;
        }

        public Integer getTrialLengthInDays()
        {
            return trialLengthInDays;
        }

        public void setTrialLengthInDays( Integer trialLengthInDays )
        {
            this.trialLengthInDays = trialLengthInDays;
        }

        public Integer getSandboxLengthInHour()
        {
            return sandboxLengthInHour;
        }

        public void setSandboxLengthInHour( Integer sandboxLengthInHour )
        {
            this.sandboxLengthInHour = sandboxLengthInHour;
        }

        public BigDecimal getCloudesirePercentage()
        {
            return cloudesirePercentage;
        }

        public void setCloudesirePercentage( BigDecimal cloudesirePercentage )
        {
            this.cloudesirePercentage = cloudesirePercentage;
        }

        public List<Integer> getCustomerInvoicePeriod()
        {
            return Collections.unmodifiableList( customerInvoicePeriod );
        }

        public void setCustomerInvoicePeriod( List<Integer> customerInvoicePeriod )
        {
            this.customerInvoicePeriod = customerInvoicePeriod;
        }

        public int getDiskSpaceLimit()
        {
            return diskSpaceLimit;
        }

        public void setDiskSpaceLimit( int diskSpaceLimit )
        {
            this.diskSpaceLimit = diskSpaceLimit;
        }

        public String getCurrency()
        {
            return currency;
        }

        public void setCurrency( String currency )
        {
            this.currency = currency;
        }

        public AddressDTO getPlatformAddress()
        {
            return platformAddress;
        }

        public void setPlatformAddress( AddressDTO platformAddress )
        {
            this.platformAddress = platformAddress;
        }

        public String getNation()
        {
            if ( platformAddress != null ) return platformAddress.getCountryCode();

            return nation;
        }

        /**
         * @deprecated by {@link #setPlatformAddress(AddressDTO)}
         */
        @Deprecated
        public void setNation( String nation )
        {
            this.nation = nation;
        }

        public boolean isTaxCodeValidation()
        {
            return taxCodeValidation;
        }

        public void setTaxCodeValidation( boolean taxCodeValidation )
        {
            this.taxCodeValidation = taxCodeValidation;
        }

        public int getCompanyMaxPublishedProducts()
        {
            return companyMaxPublishedProducts;
        }

        public void setCompanyMaxPublishedProducts( int companyMaxPublishedProducts )
        {
            this.companyMaxPublishedProducts = companyMaxPublishedProducts;
        }

        public List<EntryDTO> getMetricFrequencyValues()
        {
            return metricFrequencyValues;
        }

        public void setMetricFrequencyValues( List<EntryDTO> metricFrequencyValues )
        {
            this.metricFrequencyValues = metricFrequencyValues;
        }

        public List<String> getEnabledCloudProviders()
        {
            return enabledCloudProviders;
        }

        public void setEnabledCloudProviders( List<String> enabledCloudProviders )
        {
            this.enabledCloudProviders = enabledCloudProviders;
        }

        public List<String> getEnabledCategories()
        {
            return enabledCategories;
        }

        public ConfigurationEnvironment setEnabledCategories( List<String> enabledCategories )
        {
            this.enabledCategories = enabledCategories;
            return this;
        }

        public List<String> getDisabledCategories()
        {
            return disabledCategories;
        }

        public ConfigurationEnvironment setDisabledCategories( List<String> disabledCategories )
        {
            this.disabledCategories = disabledCategories;
            return this;
        }

        public String getAnonymousUserCountryCode()
        {
            return anonymousUserCountryCode;
        }

        public ConfigurationEnvironment setAnonymousUserCountryCode( String anonymousUserCountryCode )
        {
            this.anonymousUserCountryCode = anonymousUserCountryCode;
            return this;
        }

        public String getAppsHostnameDomain()
        {
            return appsHostnameDomain;
        }

        public void setAppsHostnameDomain( String appsHostnameDomain )
        {
            this.appsHostnameDomain = appsHostnameDomain;
        }

        public List<SyndicationEndpointDTO> getSyndicationEndpoints()
        {
            return syndicationEndpoints;
        }

        public void setSyndicationEndpoints( List<SyndicationEndpointDTO> syndicationEndpoints )
        {
            this.syndicationEndpoints = syndicationEndpoints;
        }

        @Deprecated
        public void setSyndicationEndpoint( String syndicationEndpoint )
        {
            if ( syndicationEndpoint == null ) return;
            SyndicationEndpointDTO endpoint = getCurrentOrNewEndpoint();
            endpoint.setUrl( syndicationEndpoint );
            syndicationEndpoints = Collections.singletonList( endpoint );
        }

        @Deprecated
        public void setSyndicationEndpointSecretToken( String syndicationEndpointSecretToken )
        {
            if ( syndicationEndpointSecretToken == null ) return;
            SyndicationEndpointDTO endpoint = getCurrentOrNewEndpoint();
            endpoint.setSecret( syndicationEndpointSecretToken );
            syndicationEndpoints = Collections.singletonList( endpoint );
        }

        private SyndicationEndpointDTO getCurrentOrNewEndpoint()
        {
            if ( syndicationEndpoints != null && ! syndicationEndpoints.isEmpty() )
            {
                return syndicationEndpoints.get( 0 );
            }

            return new SyndicationEndpointDTO();
        }

        /**
         * @deprecated by {@link #serviceDirectory}
         */
        @Deprecated
        public void setCapValidationServiceUrl( String capValidationServiceUrl )
        {
            if ( serviceDirectory.getCapValidation() != null ) return;
            serviceDirectory.setCapValidation( capValidationServiceUrl );
        }

        /**
         * @deprecated by {@link #serviceDirectory}
         */
        @Deprecated
        public void setJanineInvoiceManagerUrl( String janineInvoiceManagerUrl )
        {
            if ( serviceDirectory.getJanineInvoiceManager() != null ) return;
            serviceDirectory.setJanineInvoiceManager( janineInvoiceManagerUrl );
        }

        public List<String> getSlackNotificationEndpoints()
        {
            return slackNotificationEndpoints;
        }

        public void setSlackNotificationEndpoints( List<String> slackNotificationEndpoints )
        {
            this.slackNotificationEndpoints = slackNotificationEndpoints;
        }

        /**
         * @deprecated by {@link #slackNotificationEndpoints}
         */
        @Deprecated
        public void setSlackNotificationEndpoint( String endpoint )
        {
            if ( endpoint != null ) slackNotificationEndpoints = Collections.singletonList( endpoint );
        }

        /**
         * @deprecated by {@link #serviceDirectory}
         */
        @Deprecated
        public void setZuoraConnectorUrl( String zuoraConnectorUrl )
        {
            if ( serviceDirectory.getZuoraConnector() != null ) return;
            serviceDirectory.setZuoraConnector( zuoraConnectorUrl );
        }

        public Boolean getSendActivationEmail()
        {
            return sendActivationEmail;
        }

        public void setSendActivationEmail( Boolean sendActivationEmail )
        {
            this.sendActivationEmail = sendActivationEmail;
        }

        public Long getMaxFileSize()
        {
            return maxFileSize;
        }

        public void setMaxFileSize( Long maxFileSize )
        {
            this.maxFileSize = maxFileSize;
        }

        public VatService getVatService()
        {
            return vatService;
        }

        public void setVatService( VatService vatService )
        {
            this.vatService = vatService;
        }

        public BigDecimal getCustomVat()
        {
            return customVat;
        }

        public void setCustomVat( BigDecimal customVat )
        {
            this.customVat = customVat;
        }

        public SubscriptionsPerProduct getSubscriptionsPerProduct()
        {
            return subscriptionsPerProduct;
        }

        public void setSubscriptionsPerProduct( SubscriptionsPerProduct subscriptionsPerProduct )
        {
            this.subscriptionsPerProduct = subscriptionsPerProduct;
        }

        public String getSlackChannel()
        {
            return slackChannel;
        }

        public void setSlackChannel( String slackChannel )
        {
            this.slackChannel = slackChannel;
        }

        public List<String> getSupportedApplicationFileTypes()
        {
            return supportedApplicationFileTypes;
        }

        public void setSupportedApplicationFileTypes( List<String> supportedApplicationFileTypes )
        {
            this.supportedApplicationFileTypes = supportedApplicationFileTypes;
        }

        public List<String> getSupportedCompanyLogoFileTypes()
        {
            return supportedCompanyLogoFileTypes;
        }

        public void setSupportedCompanyLogoFileTypes( List<String> supportedCompanyLogoFileTypes )
        {
            this.supportedCompanyLogoFileTypes = supportedCompanyLogoFileTypes;
        }

        public Map<String, List<String>> getSupportedFileTypes()
        {
            return supportedFileTypes;
        }

        public void setSupportedFileTypes( Map<String, List<String>> supportedFileTypes )
        {
            this.supportedFileTypes = supportedFileTypes;
        }

        public List<String> getSupportedPublicUserFileTypes()
        {
            return supportedPublicUserFileTypes;
        }

        public void setSupportedPublicUserFileTypes( List<String> supportedPublicUserFileTypes )
        {
            this.supportedPublicUserFileTypes = supportedPublicUserFileTypes;
        }

        public Map<CspProductType, String> getCspApiEndpoints()
        {
            return cspApiEndpoints;
        }

        public void setCspApiEndpoints( Map<CspProductType, String> cspApiEndpoints )
        {
            this.cspApiEndpoints = cspApiEndpoints;
        }

        public String getCspAzureProductId()
        {
            return cspAzureProductId;
        }

        public void setCspAzureProductId( String cspAzureProductId )
        {
            this.cspAzureProductId = cspAzureProductId;
        }

        public String getCspAzureParameterCode()
        {
            return cspAzureParameterCode;
        }

        public void setCspAzureParameterCode( String cspAzureParameterCode )
        {
            this.cspAzureParameterCode = cspAzureParameterCode;
        }

        public String getCspLicenseIdentifier()
        {
            return cspLicenseIdentifier;
        }

        public void setCspLicenseIdentifier( String cspLicenseIdentifier )
        {
            this.cspLicenseIdentifier = cspLicenseIdentifier;
        }

        public ProductDestination getCspDefaultProductDestination()
        {
            return cspDefaultProductDestination;
        }

        public void setCspDefaultProductDestination( ProductDestination cspDefaultProductDestination )
        {
            this.cspDefaultProductDestination = cspDefaultProductDestination;
        }

        public ServiceDirectory getServiceDirectory()
        {
            return serviceDirectory;
        }

        public void setServiceDirectory( ServiceDirectory serviceDirectory )
        {
            this.serviceDirectory = serviceDirectory;
        }

        public boolean isTrialForBundles()
        {
            return trialForBundles;
        }

        public void setTrialForBundles( boolean trialForBundles )
        {
            this.trialForBundles = trialForBundles;
        }
        //endregion

        public enum SubscriptionsPerProduct
        {
            @ApiModelProperty( "One subscription per product at a time is allowed" )
            ONE,

            @ApiModelProperty( "Only one trial per product" )
            TRIAL,

            @ApiModelProperty( "No check is done" )
            UNLIMITED
        }

        public enum VatService
        {
            INTERNAL, TAXJAR
        }
    }

    @ApiModel( description = "URL patterns used to build links to the GUI inside notification (e.g. email, slack, ...)" )
    public static class UrlPatterns
    {
        @NotEmpty
        private String accountActivation;

        @NotEmpty
        private String accountRecovery;

        @NotEmpty
        private String buy;

        @NotEmpty
        private String company;

        @NotEmpty
        private String dashboard;

        @NotEmpty
        private String invoice;

        @NotEmpty
        private String invoicePayment;

        @NotEmpty
        private String order;

        @NotEmpty
        private String proceeds;

        @NotEmpty
        private String product;

        @NotEmpty
        private String productDraft;

        @NotEmpty
        private String subscription;

        @NotEmpty
        private String unsubscribe;

        @NotEmpty
        private String user;

        // region Auto-generated code
        public String getAccountActivation()
        {
            return accountActivation;
        }

        public void setAccountActivation( String accountActivation )
        {
            this.accountActivation = accountActivation;
        }

        public String getAccountRecovery()
        {
            return accountRecovery;
        }

        public void setAccountRecovery( String accountRecovery )
        {
            this.accountRecovery = accountRecovery;
        }

        public String getBuy()
        {
            return buy;
        }

        public void setBuy( String buy )
        {
            this.buy = buy;
        }

        public String getCompany()
        {
            return company;
        }

        public void setCompany( String company )
        {
            this.company = company;
        }

        public String getDashboard()
        {
            return dashboard;
        }

        public void setDashboard( String dashboard )
        {
            this.dashboard = dashboard;
        }

        public String getInvoice()
        {
            return invoice;
        }

        public void setInvoice( String invoice )
        {
            this.invoice = invoice;
        }

        public String getInvoicePayment()
        {
            return invoicePayment;
        }

        public void setInvoicePayment( String invoicePayment )
        {
            this.invoicePayment = invoicePayment;
        }

        public String getOrder()
        {
            return order;
        }

        public void setOrder( String order )
        {
            this.order = order;
        }

        public String getProceeds()
        {
            return proceeds;
        }

        public void setProceeds( String proceeds )
        {
            this.proceeds = proceeds;
        }

        public String getProduct()
        {
            return product;
        }

        public void setProduct( String product )
        {
            this.product = product;
        }

        public String getProductDraft()
        {
            return productDraft;
        }

        public void setProductDraft( String productDraft )
        {
            this.productDraft = productDraft;
        }

        public String getSubscription()
        {
            return subscription;
        }

        public void setSubscription( String subscription )
        {
            this.subscription = subscription;
        }

        public String getUnsubscribe()
        {
            return unsubscribe;
        }

        public void setUnsubscribe( String unsubscribe )
        {
            this.unsubscribe = unsubscribe;
        }

        public String getUser()
        {
            return user;
        }

        public void setUser( String user )
        {
            this.user = user;
        }
        // endregion
    }

    public static class ServiceDirectory
    {
        @ApiModelProperty( "URL for the CAP (italian postal code) validation microservice" )
        @URL
        private String capValidation;

        @ApiModelProperty( "URL to PDF invoice manager" )
        @URL
        private String janineInvoiceManager;

        @ApiModelProperty( "URL for the Prometheus instance" )
        @URL
        private String prometheus;

        @ApiModelProperty( "URL for the Zuora connector" )
        @URL
        private String zuoraConnector;

        public String getCapValidation()
        {
            return capValidation;
        }

        public void setCapValidation( String capValidation )
        {
            this.capValidation = capValidation;
        }

        public String getJanineInvoiceManager()
        {
            return janineInvoiceManager;
        }

        public void setJanineInvoiceManager( String janineInvoiceManager )
        {
            this.janineInvoiceManager = janineInvoiceManager;
        }

        public String getPrometheus()
        {
            return prometheus;
        }

        public void setPrometheus( String prometheus )
        {
            this.prometheus = prometheus;
        }

        public String getZuoraConnector()
        {
            return zuoraConnector;
        }

        public void setZuoraConnector( String zuoraConnector )
        {
            this.zuoraConnector = zuoraConnector;
        }
    }

    @ApiModelProperty( hidden = true )
    @AssertTrue( message = "Missing CSP API connector endpoint" )
    public boolean isCspConnectorConfigured()
    {
        if ( features.enabledProductTypes.contains( ProductType.CSP ) )
        {
            Map<CspProductType, String> endpoints = configuration.cspApiEndpoints;
            return endpoints != null && endpoints.keySet().containsAll( EnumSet.allOf( CspProductType.class ) );
        }

        return true;
    }

    @ApiModelProperty( hidden = true )
    @AssertTrue( message = "Internal VAT service is available in Italy only" )
    public boolean isInternalVatServiceInItalyOnly()
    {
        boolean italianInstallation = configuration.getNation().equalsIgnoreCase( "it" );
        boolean internalVatService = configuration.getVatService() == ConfigurationEnvironment.VatService.INTERNAL;

        if ( internalVatService ) return italianInstallation;

        return true;
    }

    @Override
    public boolean equals( Object o )
    {
        if ( this == o ) return true;
        if ( !( o instanceof EnvironmentDTO ) ) return false;
        EnvironmentDTO that = (EnvironmentDTO) o;
        return defaultEnvironment == that.defaultEnvironment && Objects.equals( environmentName, that.environmentName );
    }

    @Override
    public int hashCode()
    {
        return Objects.hash( environmentName, defaultEnvironment );
    }

    @Override
    public String toString()
    {
        return "EnvironmentDTO{" + "environmentName='" + environmentName + '\'' + ", defaultEnvironment="
                + defaultEnvironment + '}';
    }
}
