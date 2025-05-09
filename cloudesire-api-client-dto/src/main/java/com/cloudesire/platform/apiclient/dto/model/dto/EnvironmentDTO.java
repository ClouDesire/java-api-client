package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CloudCredentialsSupport;
import com.cloudesire.platform.apiclient.dto.model.enums.CspProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.OrderType;
import com.cloudesire.platform.apiclient.dto.model.enums.PaymentGateway;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductDestination;
import com.cloudesire.platform.apiclient.dto.model.enums.ProductType;
import com.cloudesire.platform.apiclient.dto.model.enums.SubscriptionsPerProduct;
import com.cloudesire.platform.apiclient.dto.model.enums.UserRole;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.liberologico.cloudesire.common.Regexp;
import com.liberologico.cloudesire.common.validators.CurrencyMap;
import io.swagger.v3.oas.annotations.media.Schema;
import org.hibernate.validator.constraints.URL;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;

@Schema( description = "Platform configuration" )
public class EnvironmentDTO implements DTO
{
    @Schema( description = "The name of this environment")
    @NotEmpty
    @Size( max = 255 )
    private String environmentName;

    @Schema( description = "The name of the current chef environment")
    @NotEmpty
    @Size( max = 255 )
    private String chefEnvironmentName;

    @Schema( description = "The name of the mail environment")
    @NotEmpty
    @Size( max = 255 )
    private String mailEnvironmentName = "defaultMailEnvironment";

    @Schema( description = "The identifier for the overrides of mail templates")
    private String mailTemplateOverride;

    @Schema( description = "The name of the store as it will appear in transactional emails")
    @NotEmpty
    @Size( max = 255 )
    private String storeName;

    @Schema( description = "The name of the support team, used in email signatures")
    @NotEmpty
    @Size( max = 255 )
    private String teamName;

    @Schema( description = "If this is the default environment")
    private boolean defaultEnvironment = false;

    @Schema( description = "The base URL of the frontend")
    @NotNull
    @URL
    @Size( max = 2048 )
    private String frontendUrl;

    /**
     * Needs one `[[reseller]]` placeholder.
     */
    @Schema( description = "Pattern generating frontend URLs for a reseller")
    @NotEmpty
    private String frontendResellerPattern;

    @Schema( description = "Patterns to generate links to the frontend")
    @Valid
    private UrlPatterns urlPatterns;

    @Schema( hidden = true )
    @Deprecated
    @Email
    private String operationGroup;

    @Schema( description = "Sender name of all the emails generated")
    @NotEmpty
    @Size( max = 255 )
    private String mailSenderName;

    @Schema( description = "Sender email of all the emails generated")
    @NotEmpty
    @Email
    private String mailSenderAddress;

    @Schema( description = "Tag added into the subject for all outgoing emails")
    @Size( max = 20 )
    private String mailSubjectTag;

    @Schema( description = "URL of the logo of all outgoing emails")
    @URL
    private String mailLogo;

    @Schema( description = "Email palette colors")
    @Valid
    private EmailPalette mailPalette = new EmailPalette();

    @Schema( description = "Footer for all the emails")
    @Size( max = 2048 )
    private String mailFooter;

    @Schema( description = "Support email for customers")
    @Email
    @NotEmpty
    private String supportMail;

    @Schema( description = "SendGrid template id to use")
    @NotEmpty
    @Size( max = 255 )
    private String sendGridTemplateID;

    @Schema( description = "When using SendGrid for email delivery, enable sandbox mode to not actually deliver any emails")
    private boolean sendGridSandbox;

    @Schema( description = "The full URL for the documentation")
    @NotEmpty
    @URL
    @Size( max = 2048 )
    private String documentationUrl;

    @Schema( description = "Section of default user values")
    @NotNull
    @Valid
    private DefaultUserValues defaultUserValues;

    @Schema( description = "Section for subscriptions alerts")
    @NotNull
    @Valid
    private SubscriptionTerm subscriptionTerm;

    @Schema( description = "Days after a customer cannot pay a subscription anymore")
    private int daysAfterFirstPaymentExpires = 3;

    @Schema( description = "Section for invoice alerts")
    @NotNull
    @Valid
    private InvoiceSleepTerm invoiceTerm;

    @Schema( description = "Email sent for registration")
    @Valid
    @NotNull
    private MailCustomization registration = new MailCustomization();

    @Schema( description = "Email sent for new invoices")
    @Valid
    @NotNull
    private NotificationMailCustomization invoice = new NotificationMailCustomization();

    @Schema( description = "Email sent for paid invoices")
    @Valid
    @NotNull
    private MailCustomization invoicePaid = new MailCustomization();

    @Schema( description = "Email sent when user must set password for the first time")
    @Valid
    @NotNull
    private MailCustomization passwordSet = new MailCustomization();

    @Schema( description = "Email sent when starting password recovery procedure")
    @Valid
    @NotNull
    private MailCustomization passwordRecovery = new MailCustomization();

    @Schema( description = "Email sent when password set procedure completes")
    @Valid
    @NotNull
    private MailCustomization passwordSetDone = new MailCustomization();

    @Schema( description = "Email sent when password recovery procedure completes")
    @Valid
    @NotNull
    private MailCustomization passwordRecoveryDone = new MailCustomization();

    @Schema( description = "Email sent for new orders")
    @Valid
    @NotNull
    private NotificationMailCustomization orderNotifier = new NotificationMailCustomization();

    @Schema( description = "Email sent on order approval to customer")
    @Valid
    @NotNull
    private NotificationMailCustomization orderApprovalCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent on order creation to customer")
    @Valid
    @NotNull
    private NotificationMailCustomization orderCreationCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent on order creation to platform actors")
    @Valid
    @NotNull
    private MailCustomization orderCreationPlatform = new MailCustomization();

    @Schema( description = "Email sent on order reject to customer")
    @Valid
    @NotNull
    private NotificationMailCustomization orderReject = new NotificationMailCustomization();

    @Schema( description = "Email sent on order request to customer")
    @Valid
    @NotNull
    private NotificationMailCustomization orderRequestCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent to the vendor/reseller when customer requests changes to an application")
    @Valid
    @NotNull
    private MailCustomization subscriptionAmendment = new MailCustomization();

    @Schema( description = "Email sent to the customer on request for changes to an application")
    @Valid
    @NotNull
    private NotificationMailCustomization subscriptionAmendmentCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent to the customer when application has been undeployed")
    @Valid
    @NotNull
    private NotificationMailCustomization orderUndeployCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent to the vendor when application has been undeployed")
    @Valid
    @NotNull
    private MailCustomization orderUndeployVendor = new MailCustomization();

    @Schema( description = "Email sent when deploy go wrong")
    @Valid
    @NotNull
    private MailCustomization deployFailed = new MailCustomization();

    @Schema( description = "Email sent to the vendor when deployment is completed")
    @Valid
    @NotNull
    private MailCustomization deployCompleteVendor = new MailCustomization();

    @Schema( description = "Email sent to the vendor when deployment is completed but needs post configuration")
    @Valid
    @NotNull
    private MailCustomization deployCompleteWithPostConfigurationVendor = new MailCustomization();

    @Schema( description = "Email sent to the customer when deployment is completed")
    @Valid
    @NotNull
    private NotificationMailCustomization deployCompleteCustomer = new NotificationMailCustomization();

    @Schema( description = "Email sent to the configured address when deployment is completed")
    @Valid
    @NotNull
    private MailCustomization deployCompleteExternal = new MailCustomization();

    @Schema( description = "Email sent to the configured addresses when a vendor request an approval for changes of a product")
    @Valid
    @NotNull
    private MailCustomization approvalRequest = new MailCustomization();

    @Schema( description = "Email sent to the vendor of a subscription stuck in pending state")
    @Valid
    @NotNull
    private MailCustomization stuckSubscription = new MailCustomization();

    @Schema( description = "Sent when subscription is reaching end date")
    @Valid
    @NotNull
    private MailCustomization subscriptionTermAlarm = new MailCustomization();

    @Schema( description = "Email sent to the vendor when his account is approved")
    @Valid
    @NotNull
    private MailCustomization vendorApproval = new MailCustomization();

    @Schema( description = "Email containing vendor data")
    @Valid
    @NotNull
    private MailCustomization vendorApprovalData = new MailCustomization();

    @Schema( description = "Email sent on product approval to the company")
    @Valid
    @NotNull
    private MailCustomization productApproval = new MailCustomization();

    @Schema( description = "Email sent on product approval containing product data")
    @Valid
    @NotNull
    private MailCustomization productApprovalData = new MailCustomization();

    @Schema( description = "Email sent on vendor registration")
    @Valid
    @NotNull
    private MailCustomization vendorRegistration = new MailCustomization();

    @Schema( description = "Email sent on vendor registration to admin(s)")
    @Valid
    @NotNull
    private MailCustomization vendorRegistrationNotification = new MailCustomization();

    @Schema( description = "Email sent on customer registration/update")
    @Valid
    @NotNull
    private MailCustomization customerNotification = new MailCustomization();

    @Schema( description = "Email sent on customer payment method save")
    @Valid
    @NotNull
    private MailCustomization customerPaymentMethodSave = new MailCustomization();

    @Schema( description = "Email sent to a configurable address on customer order creation without approval")
    @Valid
    @NotNull
    private MailCustomization customerPendingOrder = new MailCustomization();

    @Schema( description = "Reminders before the sleep term, warn the user to pay")
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceReminder = new NotificationMailCustomization();

    @Schema( description = "Alert to inform the user that the subscription has been put to sleep")
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceSleep = new NotificationMailCustomization();

    @Schema( description = "Alert to inform the user that the subscription has been destroyed")
    @Valid
    @NotNull
    private NotificationMailCustomization invoiceDeath = new NotificationMailCustomization();

    @Schema( description = "Sent to the customer on the crossing of a billing budget threshold")
    @NotNull
    @Valid
    private MailCustomization billingBudgetThresholdCrossed = new MailCustomization();

    @Schema( description = "Sent to the customer before password expiry")
    @NotNull
    @Valid
    private NotificationMailCustomization stalePasswordReminder = new NotificationMailCustomization();

    @Schema(description = "Email report sent to notify of new users")
    @NotNull
    @Valid
    private MailCustomization dailyNewUsersReport = new MailCustomization();

    @Schema( description = "Features section")
    @Valid
    private FeaturesEnvironment features;

    @Schema( description = "Frontend Features section")
    @Valid
    private FrontendFeaturesEnvironment frontendFeatures;

    @Schema( description = "Configuration section")
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

    public FrontendFeaturesEnvironment getFrontendFeatures()
    {
        return frontendFeatures;
    }

    public void setFrontendFeatures( FrontendFeaturesEnvironment frontendFeatures )
    {
        this.frontendFeatures = frontendFeatures;
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

    public MailCustomization getDeployCompleteExternal()
    {
        return deployCompleteExternal;
    }

    public void setDeployCompleteExternal( MailCustomization deployCompleteExternal )
    {
        this.deployCompleteExternal = deployCompleteExternal;
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

    public NotificationMailCustomization getOrderApprovalCustomer()
    {
        return orderApprovalCustomer;
    }

    public void setOrderApprovalCustomer( NotificationMailCustomization orderApprovalCustomer )
    {
        this.orderApprovalCustomer = orderApprovalCustomer;
    }

    public NotificationMailCustomization getOrderCreationCustomer()
    {
        return orderCreationCustomer;
    }

    public void setOrderCreationCustomer( NotificationMailCustomization orderCreationCustomer )
    {
        this.orderCreationCustomer = orderCreationCustomer;
    }

    @Deprecated
    public void setOrderCreation( NotificationMailCustomization orderCreation )
    {
        this.orderCreationCustomer = orderCreation;
    }

    public MailCustomization getOrderCreationPlatform()
    {
        return orderCreationPlatform;
    }

    public void setOrderCreationPlatform( MailCustomization orderCreationPlatform )
    {
        this.orderCreationPlatform = orderCreationPlatform;
    }

    public NotificationMailCustomization getOrderReject()
    {
        return orderReject;
    }

    public void setOrderReject( NotificationMailCustomization orderReject )
    {
        this.orderReject = orderReject;
    }

    public NotificationMailCustomization getOrderRequestCustomer()
    {
        return orderRequestCustomer;
    }

    public void setOrderRequestCustomer( NotificationMailCustomization orderRequestCustomer )
    {
        this.orderRequestCustomer = orderRequestCustomer;
    }

    @Deprecated
    public void setOrderCreationVendor( MailCustomization orderCreationVendor )
    {
        this.orderCreationPlatform = orderCreationVendor;
    }

    public MailCustomization getSubscriptionAmendment()
    {
        return subscriptionAmendment;
    }

    public void setSubscriptionAmendment( MailCustomization subscriptionAmendment )
    {
        this.subscriptionAmendment = subscriptionAmendment;
    }

    public NotificationMailCustomization getSubscriptionAmendmentCustomer()
    {
        return subscriptionAmendmentCustomer;
    }

    public void setSubscriptionAmendmentCustomer( NotificationMailCustomization subscriptionAmendmentCustomer )
    {
        this.subscriptionAmendmentCustomer = subscriptionAmendmentCustomer;
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

    public String getMailTemplateOverride()
    {
        return mailTemplateOverride;
    }

    public void setMailTemplateOverride( String mailTemplateOverride )
    {
        this.mailTemplateOverride = mailTemplateOverride;
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

    public MailCustomization getCustomerNotification()
    {
        return customerNotification;
    }

    public void setCustomerNotification( MailCustomization customerNotification )
    {
        this.customerNotification = customerNotification;
    }

    public MailCustomization getCustomerPaymentMethodSave()
    {
        return customerPaymentMethodSave;
    }

    public void setCustomerPaymentMethodSave( MailCustomization customerPaymentMethodSave )
    {
        this.customerPaymentMethodSave = customerPaymentMethodSave;
    }

    public MailCustomization getCustomerPendingOrder()
    {
        return customerPendingOrder;
    }

    public void setCustomerPendingOrder( MailCustomization customerPendingOrder )
    {
        this.customerPendingOrder = customerPendingOrder;
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

    public MailCustomization getBillingBudgetThresholdCrossed()
    {
        return billingBudgetThresholdCrossed;
    }

    public void setBillingBudgetThresholdCrossed( MailCustomization billingBudgetThresholdCrossed )
    {
        this.billingBudgetThresholdCrossed = billingBudgetThresholdCrossed;
    }

    public NotificationMailCustomization getStalePasswordReminder()
    {
        return stalePasswordReminder;
    }

    public void setStalePasswordReminder( NotificationMailCustomization stalePasswordReminder )
    {
        this.stalePasswordReminder = stalePasswordReminder;
    }

    public MailCustomization getDailyNewUsersReport()
    {
        return dailyNewUsersReport;
    }

    public void setDailyNewUsersReport( MailCustomization dailyNewUsersReport )
    {
        this.dailyNewUsersReport = dailyNewUsersReport;
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

    public String getDocumentationUrl()
    {
        return documentationUrl;
    }

    public void setDocumentationUrl( String documentationUrl )
    {
        this.documentationUrl = documentationUrl;
    }
    //endregion

    @Schema( description = "Default attributes for new users" )
    public static class DefaultUserValues implements DTO
    {
        @Schema( description = "Enabled flag default value")
        private boolean isEnabled;

        @Schema( description = "Active flag default value")
        private boolean isActive;

        @Schema( description = "TermsAccepted flag default value")
        private boolean termsAccepted;

        @Schema( description = "Activate old account if not active when recreating account")
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

    @Schema( description = "Email palette attributes" )
    public static class EmailPalette implements DTO
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

    @Schema( description = "An instance of email template to be sent at certain events" )
    public static class MailCustomization implements DTO
    {
        public static final String DEFAULT_MAIL_LANGUAGE = "it";

        @Schema( description = "Should send emails of this type")
        private boolean serviceEnable = true;

        @Schema( description = "The recipients to send these emails to")
        private List<String> to;

        @Schema( description = "The language in which this email will be rendered")
        private String language;

        @Schema( description = "Template parameter overrides")
        private Map<String, String> parameters = new HashMap<>();

        @Schema( description = "Any additional user role to send the email to")
        private Set<UserRole> roles = EnumSet.noneOf( UserRole.class );

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

        public String[] getToAsArray()
        {
            return to != null ? to.toArray( new String[0] ) : new String[0];
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

        public Set<UserRole> getRoles()
        {
            return roles;
        }

        public void setRoles( Set<UserRole> roles )
        {
            this.roles = roles;
        }
        //endregion
    }

    @Schema( description = "A non-transactional email notification from which user can unsubscribe" )
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

    @Schema( description = "The emails to send when there are invoice with pending payment for customers" )
    public static class InvoiceSleepTerm implements DTO
    {
        @Schema( description = "Days after deadline, subscription will be set to sleeping")
        @NotNull
        private Integer sleepDays = 2;

        @Schema( description = "Days after sleep deadline, subscription will be undeployed")
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

    @Schema( description = "Fine tuning of subscription expiration behaviour")
    public static class SubscriptionTerm implements DTO
    {
        /**
         * If 0 means that it's always possible to Renew subscriptions
         * If &lt; 0 means that it's never possible to Renew subscriptions
         * If &gt; 0 means the day before expiration that renew is possible
         */
        @Schema( description = "How many days before expiration renewal is possibile")
        private int daysLeftUntilExpirationForRenewal = -1;

        @Schema( description = "List of days before expire to send email alerts about expiration")
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

    @Schema( description = "Features that can be toggled at runtime" )
    public static class FeaturesEnvironment implements DTO
    {
        @Schema( description = "Enables the creation of syndicated products")
        private boolean syndicated = false;

        @Schema( description = "Enables vendors to invoice customer on their own")
        private SelfBilling selfBilling = SelfBilling.DISABLED;

        @Schema( description = "Enables the usage of coupons")
        private boolean coupon = true;

        @Schema( description = "Enables uservoice widget")
        private boolean uservoice = true;

        @Schema( description = "Show the bandwidth")
        private boolean showBandwidth = true;

        @Schema( description = "Enables upgrading TRIAL subscriptions to NORMAL subscriptions")
        private boolean upgradeToNormal = true;

        @Schema( description = "Enable product revision")
        private boolean productRevision = false;

        @Schema( description = "Enable unmanaged orders")
        private boolean unmanagedOrders;

        @Schema( description = "Send product instructions to the customer on buy")
        private boolean instructionsInEmail = false;

        @Schema( description = "Email billing item summary to customer on buy/upgrade")
        private boolean billingItemSummaryInEmail;

        @Schema( description = "Email invoice entries to customer on buy/upgrade")
        private boolean invoiceEntriesInEmail;

        @Schema( description = "Permit links in end user instructions")
        private LinksInEndUserInstructions linksInEndUserInstructions;

        @Schema( description = "Add a legal notice into invoice footer required in Italy")
        private boolean cashAccounting = true;

        @Schema( description = "Enables upload of file to the blob storage service")
        private boolean blobStorageUpload;

        @Schema( description = "The product types enabled for this environment")
        private Set<ProductType> enabledProductTypes = EnumSet.allOf( ProductType.class );

        @Schema( description = "Require approvation for customer subscriptions")
        private boolean subscriptionApproval;

        @Schema( description = "Require approvation for subscription creation by reseller")
        private boolean resellerSubscriptionApproval;

        @Schema( description = "Enable order approval by reseller")
        private boolean resellerOrderApproval = true;

        @Schema( description = "Require approvation for vendor creation")
        private boolean vendorApproval;

        @Schema( description = "Enable selling extra resources")
        private boolean billingItems = true;

        @Schema( description = "Enabled payment gateways")
        private Set<PaymentGateway> enabledPaymentGateways = Collections.singleton( PaymentGateway.STRIPE );

        @Schema( description = "Customize reseller emails")
        private boolean resellerMailCustomization;

        @Schema( description = "Allow having more users per Distributor/Reseller company")
        private boolean multipleParentChildUsers;

        @Schema( description = "Enable Keycloak SSO")
        private boolean keycloak;

        @Schema( description = "Enable LDAP SSO")
        private boolean ldap;

        @Schema( description = "Remove customer data from notifications")
        private boolean gdpr;

        @Schema( description = "Enables custom cloud credentials")
        private CloudCredentialsSupport customerCloudCredentials = CloudCredentialsSupport.DISABLED;

        @Schema( description = "Enabled geocall data fields for the customer profile")
        private boolean geocallProfile;

        @Schema( description = "A customer can create an account without buying anything")
        private boolean userSelfRegistration = true;

        @Schema( description = "Whether to generate invoices internally")
        private Boolean generateInvoices;

        @Schema( description = "Allows the customer to send messages to vendor")
        private boolean customerMessageToVendor;

        @Schema( description = "Enable customer comments on products")
        private boolean customerProductComments = true;

        @Schema( description = "Enable customer ratings on products")
        private boolean customerProductRatings = true;

        @Schema( description = "Require the marketplace to be a reseller one")
        private boolean resellerOnlyMarketplace;

        @Schema( description = "Enable the cart functionality for CUSTOMER and/or RESELLER")
        private Set<Cart> cart = EnumSet.noneOf( Cart.class );

        @Schema( description = "Enable changelog section for product descriptions")
        private boolean productChangelog;

        @Schema( description = "Do not bill for extra resources downgrades")
        private boolean freeBillingItemDowngrades;

        @Schema( description = "Allow editing a postponed order's start date")
        private boolean editPostponedOrderDate;

        @Schema( description = "Allow editing a subscription's billing dates")
        private boolean alterSubscriptionBillingDates;

        @Schema( description = "Allow editing a user's own external ID (via PATCH)")
        private boolean patchOwnExternalId;

        public boolean commentsEnabled()
        {
            return customerProductComments || customerProductRatings;
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

        public boolean isBillingItemSummaryInEmail()
        {
            return billingItemSummaryInEmail;
        }

        public void setBillingItemSummaryInEmail( boolean billingItemSummaryInEmail )
        {
            this.billingItemSummaryInEmail = billingItemSummaryInEmail;
        }

        public boolean isInvoiceEntriesInEmail()
        {
            return invoiceEntriesInEmail;
        }

        public void setInvoiceEntriesInEmail( boolean invoiceEntriesInEmail )
        {
            this.invoiceEntriesInEmail = invoiceEntriesInEmail;
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
        @Schema( hidden = true )
        @Deprecated
        public void setProductBundles( boolean productBundles )
        {
            if ( productBundles ) enabledProductTypes.add( ProductType.BUNDLE );
            else enabledProductTypes.remove( ProductType.BUNDLE );
        }

        public boolean isSubscriptionApproval()
        {
            return subscriptionApproval;
        }

        public void setSubscriptionApproval( boolean subscriptionApproval )
        {
            this.subscriptionApproval = subscriptionApproval;
        }

        public boolean isResellerSubscriptionApproval()
        {
            return resellerSubscriptionApproval;
        }

        public void setResellerSubscriptionApproval( boolean resellerSubscriptionApproval )
        {
            this.resellerSubscriptionApproval = resellerSubscriptionApproval;
        }

        public boolean isResellerOrderApproval()
        {
            return resellerOrderApproval;
        }

        public void setResellerOrderApproval( boolean resellerOrderApproval )
        {
            this.resellerOrderApproval = resellerOrderApproval;
        }

        public boolean isVendorApproval()
        {
            return vendorApproval;
        }

        public void setVendorApproval( boolean vendorApproval )
        {
            this.vendorApproval = vendorApproval;
        }

        public boolean isBillingItems()
        {
            return billingItems;
        }

        public void setBillingItems( boolean billingItems )
        {
            this.billingItems = billingItems;
        }

        public Set<PaymentGateway> getEnabledPaymentGateways()
        {
            return new HashSet<>( enabledPaymentGateways );
        }

        public void setEnabledPaymentGateways( Set<PaymentGateway> enabledPaymentGateways )
        {
            this.enabledPaymentGateways = new HashSet<>( enabledPaymentGateways );
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

        public boolean isLdap()
        {
            return ldap;
        }

        public void setLdap( boolean ldap )
        {
            this.ldap = ldap;
        }

        public boolean isGdpr()
        {
            return gdpr;
        }

        public void setGdpr( boolean gdpr )
        {
            this.gdpr = gdpr;
        }

        public CloudCredentialsSupport getCustomerCloudCredentials()
        {
            return customerCloudCredentials;
        }

        public void setCustomerCloudCredentials( CloudCredentialsSupport customerCloudCredentials )
        {
            this.customerCloudCredentials = customerCloudCredentials;
        }

        public boolean isGeocallProfile()
        {
            return geocallProfile;
        }

        public void setGeocallProfile( boolean geocallProfile )
        {
            this.geocallProfile = geocallProfile;
        }

        public enum Cart
        {
            CUSTOMER, RESELLER
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
            @Schema( description = "Every invoice emitted is self billed")
            ENABLED,

            @Schema( description = "No invoice emitted is self billed")
            DISABLED,

            @Schema( description = "Invoices are emitted self billed according to vendor's plan or reseller's pricing")
            PER_PLAN
        }

        public boolean isUserSelfRegistration()
        {
            return userSelfRegistration;
        }

        public void setUserSelfRegistration( boolean userSelfRegistration )
        {
            this.userSelfRegistration = userSelfRegistration;
        }

        public Boolean getGenerateInvoices()
        {
            return generateInvoices;
        }

        public void setGenerateInvoices( Boolean generateInvoices )
        {
            this.generateInvoices = generateInvoices;
        }

        public boolean isCustomerMessageToVendor()
        {
            return customerMessageToVendor;
        }

        public void setCustomerMessageToVendor( boolean customerMessageToVendor )
        {
            this.customerMessageToVendor = customerMessageToVendor;
        }

        public boolean isCustomerProductComments()
        {
            return customerProductComments;
        }

        public void setCustomerProductComments( boolean customerProductComments )
        {
            this.customerProductComments = customerProductComments;
        }

        public boolean isCustomerProductRatings()
        {
            return customerProductRatings;
        }

        public void setCustomerProductRatings( boolean customerProductRatings )
        {
            this.customerProductRatings = customerProductRatings;
        }

        public boolean isResellerOnlyMarketplace()
        {
            return resellerOnlyMarketplace;
        }

        public void setResellerOnlyMarketplace( boolean resellerOnlyMarketplace )
        {
            this.resellerOnlyMarketplace = resellerOnlyMarketplace;
        }

        public Set<Cart> getCart()
        {
            return cart;
        }

        public void setCart( Set<Cart> cart )
        {
            this.cart = cart;
        }

        public boolean isProductChangelog()
        {
            return productChangelog;
        }

        public void setProductChangelog( boolean productChangelog )
        {
            this.productChangelog = productChangelog;
        }

        public boolean isFreeBillingItemDowngrades()
        {
            return freeBillingItemDowngrades;
        }

        public void setFreeBillingItemDowngrades( boolean freeBillingItemDowngrades )
        {
            this.freeBillingItemDowngrades = freeBillingItemDowngrades;
        }

        public boolean isEditPostponedOrderDate()
        {
            return editPostponedOrderDate;
        }

        public void setEditPostponedOrderDate( boolean editPostponedOrderDate )
        {
            this.editPostponedOrderDate = editPostponedOrderDate;
        }

        public boolean isAlterSubscriptionBillingDates()
        {
            return alterSubscriptionBillingDates;
        }

        public void setAlterSubscriptionBillingDates( boolean alterSubscriptionBillingDates )
        {
            this.alterSubscriptionBillingDates = alterSubscriptionBillingDates;
        }

        public boolean isPatchOwnExternalId()
        {
            return patchOwnExternalId;
        }

        public void setPatchOwnExternalId( boolean patchOwnExternalId )
        {
            this.patchOwnExternalId = patchOwnExternalId;
        }
        //endregion
    }

    @Schema( description = "Frontend features that can be toggled globally at runtime and overridden on per-environment basis" )
    public static class FrontendFeaturesEnvironment implements DTO
    {
        @Schema( description = "Access to invoice section in navbar")
        private InvoiceSectionEnum invoiceSection = InvoiceSectionEnum.INVOICE;

        @Schema( description = "Enabled frontend applications")
        private Set<EnabledApplications> enabledApplications = EnumSet.of(
                EnabledApplications.MARKETPLACE, EnabledApplications.CLASSIC_CP
        );

        @Schema( description = "Access to costs section in navbar")
        private boolean costsSection;

        @Schema( description = "Enable postponed subscription upgrades")
        private boolean postponedUpgrades;

        @Valid
        private List<RouteAuthorizationDTO> routeAuthorizations;

        // region enums
        public enum InvoiceSectionEnum
        {
            INVOICE, CONSUMPTION_SUMMARY, DISABLED
        }

        public enum EnabledApplications
        {
            MARKETPLACE, CLASSIC_CP, VUE_CP
        }
        // endregion

        // region accessors
        public InvoiceSectionEnum getInvoiceSection()
        {
            return invoiceSection;
        }

        public void setInvoiceSection( InvoiceSectionEnum invoiceSection )
        {
            this.invoiceSection = invoiceSection;
        }

        public Set<EnabledApplications> getEnabledApplications()
        {
            return enabledApplications;
        }

        public void setEnabledApplications( Set<EnabledApplications> enabledApplications )
        {
            this.enabledApplications = enabledApplications;
        }

        public Boolean getCostsSection()
        {
            return costsSection;
        }

        public void setCostsSection( Boolean costsSection )
        {
            this.costsSection = costsSection;
        }

        public boolean getPostponedUpgrades()
        {
            return postponedUpgrades;
        }

        public void setPostponedUpgrades( boolean postponedUpgrades )
        {
            this.postponedUpgrades = postponedUpgrades;
        }

        public List<RouteAuthorizationDTO> getRouteAuthorizations()
        {
            return routeAuthorizations;
        }

        public void setRouteAuthorizations( List<RouteAuthorizationDTO> routeAuthorizations )
        {
            this.routeAuthorizations = routeAuthorizations;
        }
        // endregion
    }

    @Schema( description = "General configuration of the platform" )
    public static class ConfigurationEnvironment implements DTO
    {
        // -1 means unlimited
        @Schema( description = "Limit concurrent customer trial requests")
        private int trialLimit = -1;

        @Schema( description = "Default trials duration")
        private int trialLengthInDays = 1;

        @Schema( description = "Permit trials for bundles")
        private boolean trialForBundles;

        @Schema( description = "Default sandbox duration")
        private int sandboxLengthInHour = 1;

        @NotNull
        @Schema( description = "Percentage (fee) kept by platform owner set by default on new products and for custom invoices")
        private BigDecimal cloudesirePercentage = new BigDecimal( 0 );

        @Schema( description = "The billingPeriods (how often customers receive invoices) a vendor can chose for its products")
        @NotNull
        private List<Integer> customerInvoicePeriod = Arrays.asList( 1, 3, 6, 12, 24 );

        @Schema( description = "Max available disk size when creating VMC")
        private int diskSpaceLimit = 10000;

        @Schema( description = "Default currency representation")
        @NotEmpty
        @Size( max = 3 )
        private String currency = "EUR";

        @Schema( description = "The address from which invoices are generated")
        @Valid
        private AddressDTO platformAddress;

        @Schema( description = "Enable validation of VAT ID for companies")
        private boolean taxCodeValidation;

        @Schema( description = "The default maximum number of published products for a newly created company")
        private int companyMaxPublishedProducts = -1;

        @Schema( description = "The maximum number of featured products")
        private int maximumFeaturedProducts = -1;

        @Schema( description = "The number of most sold products to show in statistics")
        private int mostSoldProductVersions = 10;

        @Schema( description = "The number of most profitable products to show in statistics")
        private int mostProfitableProductVersions = 10;

        @Schema( description = "The number of most activated products to show in statistics")
        private int mostActivatedProductVersions = 10;

        @Schema( description = "The number of top spending customers to show in statistics")
        private int mostProfitableCustomers = 10;

        @Schema( description = "The minimum date for statistics calculation")
        private Date startStatisticsCalculationFrom = new Date( 0L );

        @Schema( description = "Send these extra headers to the HTTP request to obtain application metrics")
        @Valid
        private List<EntryDTO> metricRequestExtraHeaders = new ArrayList<>();

        @Schema( description = "The cloud provider names enabled for this environment")
        private List<String> enabledCloudProviders;

        @Schema( description = "The product category names enabled for this environment")
        private List<String> enabledCategories;

        @Schema( description = "The product category names disabled for this environment")
        private List<String> disabledCategories;

        @Schema( description = "Anonymous user default country code")
        @NotNull
        private String anonymousUserCountryCode;

        @Schema( description = "End of the hostname generated. eg: apps.com")
        @NotNull
        private String appsHostnameDomain;

        @Schema( description = "Global syndication endpoints")
        @Valid
        private List<SyndicationEndpointDTO> syndicationEndpoints;

        // Works as feature flag too (empty means disabled)
        @Schema( description = "List of Slack Incoming Webhook to send platform notifications")
        private List<String> slackNotificationEndpoints;

        @Schema( description = "Slack channel that receives notifications")
        @Size( max = 255 )
        private String slackChannel;

        @Schema( description = "Send activation email on user creation")
        @NotNull
        private Boolean sendActivationEmail;

        @Schema( description = "Maximum size for uploaded files in bytes, a value < 1 disables check")
        @NotNull
        private Long maxFileSize = 0L;

        @Schema( description = "Maximum number of days for a password to be stale, a null or <1 value disables expiry")
        private Long maximumPasswordStaleDays;

        @Schema(
                description = "How many days to notify before password staleness, null or empty disables notification",
                example = "[7, 6, 5, 4, 3, 2, 1]"
        )
        private List<Integer> stalePasswordNotificationPlan;

        @Schema( description = "Content types of supported application files, null or empty disables feature")
        private List<String> supportedApplicationFileTypes;

        @Schema( description = "Content types of supported company and product images, null or empty disables feature")
        private List<String> supportedCompanyLogoFileTypes;

        @Schema( description = "Content types of supported file uploads, grouped by request type")
        private Map<String, List<String>> supportedFileTypes;

        @Schema( description = "Content types of supported public files, null or empty disables feature")
        private List<String> supportedPublicUserFileTypes;

        @Schema( description = "The VAT calculator on placed orders")
        @NotNull
        private VatService vatService = VatService.INTERNAL;

        @Schema( description = "If configured, every invoice line will have this VAT")
        private BigDecimal customVat;

        @Schema( description = "How many subscriptions to allow per-user for a product")
        private SubscriptionsPerProduct subscriptionsPerProduct;

        @Schema( description = "URLs for the CSP API connector per product type")
        private Map<CspProductType, String> cspApiEndpoints;

        @Schema( description = "The id of the current Azure pay-per-use CSP offer")
        private String cspAzureProductId = "MS-AZR-0146P";

        @Schema( description = "The code to use when autocreating the ConfigurationParameter for Azure CSP products")
        private String cspAzureParameterCode = "DNS_PREFIX";

        @Schema( description = "The identifier used when autocreating the BillingItem for licence CSP products")
        private String cspLicenseIdentifier = "licenses";

        @Schema( description = "The default destination for a CSP product")
        private ProductDestination cspDefaultProductDestination = ProductDestination.B2B;

        @Schema( description = "URLs for services")
        @Valid
        private ServiceDirectory serviceDirectory = new ServiceDirectory();

        @Schema( description = "Keep customer data disk after Subscription undeploy")
        private Boolean keepCustomerDataDisk = true;

        @Schema( description = "Pairs of Product Version IDs to be estimated together")
        private List<List<Integer>> comparableProductVersions;

        @Schema( description = "Password policy")
        @Valid
        private PasswordPolicy passwordPolicy = new PasswordPolicy();

        @Schema( description = "Conversion factors from foreign currencies")
        @CurrencyMap
        private Map<String, BigDecimal> currencyConversion = new HashMap<>();

        @Schema( description = "Salient metadata for the environment")
        private SalientMetadata salientMetadata = new SalientMetadata();

        @Schema( description = "API rate limiter configuration")
        @Valid
        private RateLimiter rateLimiter = new RateLimiter();

        @Schema( description = "Lockout IPs after authentication failure" )
        @Valid
        private LockoutPolicy lockoutPolicy = new LockoutPolicy();

        private Map<String, Long> customLatencyMeterThreshold = new HashMap<>();

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
            else return "IT";
        }

        /**
         * @deprecated by {@link #setPlatformAddress(AddressDTO)}
         */
        @Deprecated
        public void setNation( String nation )
        {
            if ( platformAddress != null ) platformAddress.setCountryCode( nation );
            else platformAddress = new AddressDTO( nation );
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

        public int getMaximumFeaturedProducts()
        {
            return maximumFeaturedProducts;
        }

        public void setMaximumFeaturedProducts( int maximumFeaturedProducts )
        {
            this.maximumFeaturedProducts = maximumFeaturedProducts;
        }

        public int getMostSoldProductVersions()
        {
            return mostSoldProductVersions;
        }

        public void setMostSoldProductVersions( int mostSoldProductVersions )
        {
            this.mostSoldProductVersions = mostSoldProductVersions;
        }

        public int getMostProfitableProductVersions()
        {
            return mostProfitableProductVersions;
        }

        public void setMostProfitableProductVersions( int mostProfitableProductVersions )
        {
            this.mostProfitableProductVersions = mostProfitableProductVersions;
        }

        public int getMostActivatedProductVersions()
        {
            return mostActivatedProductVersions;
        }

        public void setMostActivatedProductVersions( int mostActivatedProductVersions )
        {
            this.mostActivatedProductVersions = mostActivatedProductVersions;
        }

        public int getMostProfitableCustomers()
        {
            return mostProfitableCustomers;
        }

        public void setMostProfitableCustomers( int mostProfitableCustomers )
        {
            this.mostProfitableCustomers = mostProfitableCustomers;
        }

        public Date getStartStatisticsCalculationFrom()
        {
            return startStatisticsCalculationFrom;
        }

        public void setStartStatisticsCalculationFrom( Date startStatisticsCalculationFrom )
        {
            this.startStatisticsCalculationFrom = startStatisticsCalculationFrom;
        }

        public List<EntryDTO> getMetricRequestExtraHeaders()
        {
            return metricRequestExtraHeaders;
        }

        public void setMetricRequestExtraHeaders( List<EntryDTO> metricRequestExtraHeaders )
        {
            this.metricRequestExtraHeaders = metricRequestExtraHeaders;
        }

        public void setMetricRequestExtraHeader( String name, String value )
        {
            this.metricRequestExtraHeaders = List.of( new EntryDTO( name, value ) );
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

        /**
         * @deprecated use {@link #setSyndicationEndpoints(List)}
         */
        @Deprecated
        public void setSyndicationEndpoint( String syndicationEndpoint )
        {
            if ( syndicationEndpoint == null ) return;
            SyndicationEndpointDTO endpoint = getCurrentOrNewEndpoint();
            endpoint.setUrl( syndicationEndpoint );
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

        public Long getMaximumPasswordStaleDays()
        {
            return maximumPasswordStaleDays;
        }

        public void setMaximumPasswordStaleDays( Long maximumPasswordStaleDays )
        {
            this.maximumPasswordStaleDays = maximumPasswordStaleDays;
        }

        public List<Integer> getStalePasswordNotificationPlan()
        {
            if ( stalePasswordNotificationPlan == null ) return Collections.emptyList();

            return stalePasswordNotificationPlan.stream()
                    .sorted()
                    .toList();
        }

        public void setStalePasswordNotificationPlan( List<Integer> stalePasswordNotificationPlan )
        {
            this.stalePasswordNotificationPlan = stalePasswordNotificationPlan;
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

        public Boolean getKeepCustomerDataDisk()
        {
            return keepCustomerDataDisk;
        }

        public void setKeepCustomerDataDisk( Boolean keepCustomerDataDisk )
        {
            this.keepCustomerDataDisk = keepCustomerDataDisk;
        }

        public boolean isTrialForBundles()
        {
            return trialForBundles;
        }

        public void setTrialForBundles( boolean trialForBundles )
        {
            this.trialForBundles = trialForBundles;
        }

        public List<List<Integer>> getComparableProductVersions()
        {
            return comparableProductVersions;
        }

        public void setComparableProductVersions( List<List<Integer>> comparableProductVersions )
        {
            this.comparableProductVersions = comparableProductVersions;
        }

        public PasswordPolicy getPasswordPolicy()
        {
            return passwordPolicy;
        }

        public void setPasswordPolicy( PasswordPolicy passwordPolicy )
        {
            this.passwordPolicy = passwordPolicy;
        }

        public Map<String, BigDecimal> getCurrencyConversion()
        {
            return currencyConversion;
        }

        public void setCurrencyConversion( Map<String, BigDecimal> currencyConversion )
        {
            this.currencyConversion = currencyConversion;
        }

        public SalientMetadata getSalientMetadata()
        {
            return salientMetadata;
        }

        public void setSalientMetadata( SalientMetadata salientMetadata )
        {
            this.salientMetadata = salientMetadata;
        }

        public RateLimiter getRateLimiter()
        {
            return rateLimiter;
        }

        public void setRateLimiter( RateLimiter rateLimiter )
        {
            this.rateLimiter = rateLimiter;
        }

        public LockoutPolicy getLockoutPolicy()
        {
            return lockoutPolicy;
        }

        public void setLockoutPolicy( @Valid LockoutPolicy lockoutPolicy )
        {
            this.lockoutPolicy = lockoutPolicy;
        }

        public Map<String, Long> getCustomLatencyMeterThreshold()
        {
            return customLatencyMeterThreshold;
        }

        public void setCustomLatencyMeterThreshold( Map<String, Long> customLatencyMeterThreshold )
        {
            this.customLatencyMeterThreshold = customLatencyMeterThreshold;
        }
        //endregion

        public enum VatService
        {
            INTERNAL, @Deprecated TAXJAR
        }
    }

    @Schema( description = "URL patterns used to build links to the GUI inside notification (e.g. email, slack, ...)" )
    public static class UrlPatterns implements DTO
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
        private String costs;

        @NotEmpty
        private String dashboard;

        @NotEmpty
        private String invoice;

        @NotEmpty
        private String invoicePayment;

        @NotEmpty
        private String order;

        @NotEmpty
        private String orderList;

        @NotEmpty
        private String proceeds;

        @NotEmpty
        private String product;

        @NotEmpty
        private String productDraft;

        @NotEmpty
        private String resetPassword;

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

        public String getCosts()
        {
            return costs;
        }

        public void setCosts( String costs )
        {
            this.costs = costs;
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

        public String getOrderList()
        {
            return orderList;
        }

        public void setOrderList( String orderList )
        {
            this.orderList = orderList;
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

        public String getResetPassword()
        {
            return resetPassword;
        }

        public void setResetPassword( String resetPassword )
        {
            this.resetPassword = resetPassword;
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

    public static class ServiceDirectory implements DTO
    {
        @Schema( description = "URL for the CAP (italian postal code) validation microservice")
        @URL
        private String capValidation;

        @Schema( description = "URL to PDF invoice manager")
        @URL
        private String janineInvoiceManager;

        @Schema( description = "URL for the Prometheus instance")
        @URL
        private String prometheus;

        @Schema( description = "URL for the Zuora connector")
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

    public static class PasswordPolicy implements DTO
    {
        @Schema( description = "Minimum length of a password")
        private int min;

        @Schema( description = "Maximum length of a password")
        private int max = Integer.MAX_VALUE;

        @Schema( description = "Upper case characters")
        private int upper;

        @Schema( description = "Lower case characters")
        private int lower;

        @Schema( description = "Digit characters")
        private int digit;

        @Schema( description = "Special characters")
        private int special;

        @Schema( description = "History size" )
        private int history;

        public int getMin()
        {
            return min;
        }

        public void setMin( int min )
        {
            this.min = min;
        }

        public int getMax()
        {
            return max;
        }

        public void setMax( int max )
        {
            this.max = max;
        }

        public int getUpper()
        {
            return upper;
        }

        public void setUpper( int upper )
        {
            this.upper = upper;
        }

        public int getLower()
        {
            return lower;
        }

        public void setLower( int lower )
        {
            this.lower = lower;
        }

        public int getDigit()
        {
            return digit;
        }

        public void setDigit( int digit )
        {
            this.digit = digit;
        }

        public int getSpecial()
        {
            return special;
        }

        public void setSpecial( int special )
        {
            this.special = special;
        }

        public int getHistory()
        {
            return history;
        }

        public void setHistory( int history )
        {
            this.history = history;
        }
    }

    public static class SalientMetadata implements DTO, Iterable<String>
    {
        @Schema( description = "Cloud tags")
        private List<String> cloudTags = new ArrayList<>();

        @Schema( description = "Product Version metadata")
        private List<String> productVersionMetadata = new ArrayList<>();

        @Schema( description = "Subscription metadata")
        private List<String> subscriptionMetadata = new ArrayList<>();

        @Override
        public Iterator<String> iterator()
        {
            var list = new ArrayList<String>();
            list.addAll( productVersionMetadata );
            list.addAll( subscriptionMetadata );
            list.addAll( cloudTags );
            return list.iterator();
        }

        public List<String> getCloudTags()
        {
            return cloudTags;
        }

        public void setCloudTags( List<String> cloudTags )
        {
            this.cloudTags = cloudTags;
        }

        public List<String> getProductVersionMetadata()
        {
            return productVersionMetadata;
        }

        public void setProductVersionMetadata( List<String> productVersionMetadata )
        {
            this.productVersionMetadata = productVersionMetadata;
        }

        public List<String> getSubscriptionMetadata()
        {
            return subscriptionMetadata;
        }

        public void setSubscriptionMetadata( List<String> subscriptionMetadata )
        {
            this.subscriptionMetadata = subscriptionMetadata;
        }
    }

    public static class RateLimiter implements DTO
    {
        @Schema( description = "Number of tokens (requests) in the bucket")
        @Positive
        private long capacity = 5000;

        @Schema( description = "Period in minutes for the bucket to refill")
        @Positive
        private long refill = 1;

        @Schema( description = "Actually limit requests or just log a warning")
        private boolean enforced;

        public long getCapacity()
        {
            return capacity;
        }

        public void setCapacity( long capacity )
        {
            this.capacity = capacity;
        }

        public long getRefill()
        {
            return refill;
        }

        public void setRefill( long refill )
        {
            this.refill = refill;
        }

        public boolean isEnforced()
        {
            return enforced;
        }

        public void setEnforced( boolean enforced )
        {
            this.enforced = enforced;
        }
    }

    public static class LockoutPolicy implements DTO
    {
        @Schema( description = "Maximum number of attempts before lockout (0 disables feature)" )
        private int maxAttempts;

        @Schema( description = "Maximum lockout time" )
        @Positive
        private long ttl = 1;

        @Schema( description = "Time unit for the TTL" )
        @NotNull
        private TimeUnit ttlUnit = TimeUnit.HOURS;

        @Schema( description = "Base of the exponential delay after every nth failure" )
        @PositiveOrZero
        private double starveBase;

        public int getMaxAttempts()
        {
            return maxAttempts;
        }

        public void setMaxAttempts( int maxAttempts )
        {
            this.maxAttempts = maxAttempts;
        }

        public long getTtl()
        {
            return ttl;
        }

        public void setTtl( long ttl )
        {
            this.ttl = ttl;
        }

        public TimeUnit getTtlUnit()
        {
            return ttlUnit;
        }

        public void setTtlUnit( TimeUnit ttlUnit )
        {
            this.ttlUnit = ttlUnit;
        }

        public double getStarveBase()
        {
            return starveBase;
        }

        public void setStarveBase( double starveBase )
        {
            this.starveBase = starveBase;
        }

        @JsonIgnore
        public boolean isStarve()
        {
            return starveBase > 0;
        }

        /**
         * @deprecated by {@link #setStarveBase(double)}
         */
        @Deprecated
        public void setStarve( boolean starve )
        {
            if ( starve ) this.starveBase = 2;
        }
    }

    @Schema( hidden = true )
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

    @Schema( hidden = true )
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
