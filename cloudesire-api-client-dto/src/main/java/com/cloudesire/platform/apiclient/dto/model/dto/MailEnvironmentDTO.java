package com.cloudesire.platform.apiclient.dto.model.dto;

import com.cloudesire.platform.apiclient.dto.model.enums.CouponType;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Map;

import static com.cloudesire.platform.apiclient.dto.model.dto.EnvironmentDTO.MailCustomization.DEFAULT_MAIL_LANGUAGE;

public class MailEnvironmentDTO implements DTO
{
    @Valid
    private Configurations configurations;

    @Valid
    private Translations translations;

    public Configurations getConfigurations()
    {
        return configurations;
    }

    public void setConfigurations( Configurations configurations )
    {
        this.configurations = configurations;
    }

    public Translations getTranslations()
    {
        return translations;
    }

    public void setTranslations( Translations translations )
    {
        this.translations = translations;
    }

    public static class Configurations
    {
        /**
         * Email sent for discount coupon
         */
        @NotNull
        @Valid
        private MailConfiguration discountCoupon;

        /**
         * Email sent for fixed price coupon
         */
        @NotNull
        @Valid
        private MailConfiguration fixedPriceCoupon;

        /**
         * Email sent for extended trial coupon
         */
        @NotNull
        @Valid
        private MailConfiguration trialCoupon;

        /**
         * Email sent for registration
         */
        @NotNull
        @Valid
        private MailConfiguration registration;

        /**
         * Email sent for new invoices
         */
        @NotNull
        @Valid
        private MailConfiguration invoice;

        /**
         * Alert to inform the user that the subscription has been destroyed
         */
        @NotNull
        @Valid
        private MailConfiguration invoiceDeath;

        /**
         * Email sent for paid invoices
         */
        @NotNull
        @Valid
        private MailConfiguration invoicePaid;

        /**
         * Email sent for paid invoices to distributor and reseller
         */
        @NotNull
        @Valid
        private MailConfiguration invoicePaidParentChild;

        /**
         * Email sent for pending invoices, containing Sepa mandate
         */
        @NotNull
        @Valid
        private MailConfiguration invoicePending;

        /**
         * Reminders before the sleep term, warn the user to pay
         */
        @NotNull
        @Valid
        private MailConfiguration invoiceReminder;

        /**
         * Alert to inform the user that the subscription has been put to sleep
         */
        @NotNull
        @Valid
        private MailConfiguration invoiceSleep;

        /**
         * Email sent when user must set password for the first time
         */
        @NotNull
        @Valid
        private MailConfiguration passwordSet;

        /**
         * Email sent when starting password recovery procedure
         */
        @NotNull
        @Valid
        private MailConfiguration passwordRecovery;

        /**
         * Email sent when password set procedure completes
         */
        @NotNull
        @Valid
        private MailConfiguration passwordSetDone;

        /**
         * Email sent when password recovery procedure completes
         */
        @NotNull
        @Valid
        private MailConfiguration passwordRecoveryDone;

        /**
         * Email sent for new orders
         */
        @NotNull
        @Valid
        private MailConfiguration orderNotifier;

        /**
         * Email sent on order approval to customer
         */
        @NotNull
        @Valid
        private MailConfiguration orderApprovalCustomer;

        /**
         * Email sent on order creation to customer
         */
        @NotNull
        @Valid
        private MailConfiguration orderCreationCustomer;

        /**
         * Email sent on order creation to platform actors
         */
        @NotNull
        @Valid
        private MailConfiguration orderCreationPlatform;

        /**
         * Email sent on order reject to customer
         */
        @NotNull
        @Valid
        private MailConfiguration orderReject;

        /**
         * Email sent on order request for approval to customer
         */
        @NotNull
        @Valid
        private MailConfiguration orderRequestCustomer;

        /**
         * Email sent to the customer when application has been undeployed
         */
        @NotNull
        @Valid
        private MailConfiguration orderUndeployCustomer;

        /**
         * Email sent to the vendor when application has been undeployed
         */
        @NotNull
        @Valid
        private MailConfiguration orderUndeployVendor;

        /**
         * Email sent to the vendor/reseller when customer requests changes to an application
         */
        @NotNull
        @Valid
        private MailConfiguration subscriptionAmendment;

        /**
         * Email sent to the customer on request for changes to an application
         */
        @NotNull
        @Valid
        private MailConfiguration subscriptionAmendmentCustomer;

        /**
         * Email sent when deploy go wrong
         */
        @NotNull
        @Valid
        private MailConfiguration deployFailed;

        /**
         * Email sent to the vendor when deployment is completed
         */
        @NotNull
        @Valid
        private MailConfiguration deployCompleteVendor;

        /**
         * Email sent to the vendor when deployment is completed but needs post configuration
         */
        @NotNull
        @Valid
        private MailConfiguration deployCompleteWithPostConfigurationVendor;

        /**
         * Email sent to the customer when deployment is completed
         */
        @NotNull
        @Valid
        private MailConfiguration deployCompleteCustomer;

        /**
         * Email sent to the configured addresses when a vendor request an approval for changes of a product
         */
        @NotNull
        @Valid
        private MailConfiguration approvalRequest;

        /**
         * Email sent to the vendor of a subscription stuck in pending state
         */
        @NotNull
        @Valid
        private MailConfiguration stuckSubscription;

        /**
         * Email sent to the vendor when his account is approved
         */
        @NotNull
        @Valid
        private MailConfiguration subscriptionTermAlarm;

        /**
         * Email sent to the vendor when his account is approved
         */
        @NotNull
        @Valid
        private MailConfiguration vendorApproval;

        /**
         * Email containing vendor data
         */
        @NotNull
        @Valid
        private MailConfiguration vendorApprovalData;

        /**
         * Email sent on product approval to the company
         */
        @NotNull
        @Valid
        private MailConfiguration productApproval;

        /**
         * Email sent on product approval containing product data
         */
        @NotNull
        @Valid
        private MailConfiguration productApprovalData;

        /**
         * Email sent on vendor registration
         */
        @NotNull
        @Valid
        private MailConfiguration vendorRegistration;

        /**
         * Email sent on vendor registration to admin(s)
         */
        @NotNull
        @Valid
        private MailConfiguration vendorRegistrationNotification;

        /**
         * Email sent to a configurable address on customer payment method save
         */
        @NotNull
        @Valid
        private MailConfiguration customerPaymentMethodSave;

        /**
         * Email sent to a configurable address on customer registration
         */
        @NotNull
        @Valid
        private MailConfiguration customerRegistration;

        /**
         * Email sent to a configurable address on customer update
         */
        @NotNull
        @Valid
        private MailConfiguration customerUpdate;

        /**
         * Email sent to a configurable address on customer order creation without approval
         */
        @NotNull
        @Valid
        private MailConfiguration customerPendingOrder;

        /**
         * Sent to the customer on the crossing of a billing budget threshold
         */
        @NotNull
        @Valid
        private MailConfiguration billingBudgetThresholdCrossed;

        public String getCouponEmailSubject( CouponType couponType, String language )
        {
            return getCouponConfiguration( couponType ).getSubject( language );
        }

        public MailConfiguration getCouponConfiguration( CouponType couponType )
        {
            switch (couponType)
            {
                case DISCOUNT:
                    return getDiscountCoupon();
                case FIXED_PRICE:
                    return getFixedPriceCoupon();
                case TRIAL:
                case EXTENDED_TRIAL:
                    return getTrialCoupon();
                default:
                    return null;
            }
        }

        /**
         * An instance of email template to be sent at certain events
         */
        public static class MailConfiguration
        {
            /**
             * The template used for the emails of this type
             */
            @NotEmpty
            private String template;

            @NotNull
            private Map<String, String> subject;

            public String getSubject( String language )
            {
                return localize( subject, language );
            }

            //region Auto-generated getters and setters
            public String getTemplate()
            {
                return template;
            }

            public void setTemplate( String template )
            {
                this.template = template;
            }

            public Map<String, String> getSubject()
            {
                return subject;
            }

            public void setSubject( Map<String, String> subject )
            {
                this.subject = subject;
            }
            //endregion
        }

        //region Auto-generated getters and setters
        public MailConfiguration getDiscountCoupon()
        {
            return discountCoupon;
        }

        public void setDiscountCoupon( MailConfiguration discountCoupon )
        {
            this.discountCoupon = discountCoupon;
        }

        public MailConfiguration getFixedPriceCoupon()
        {
            return fixedPriceCoupon;
        }

        public void setFixedPriceCoupon( MailConfiguration fixedPriceCoupon )
        {
            this.fixedPriceCoupon = fixedPriceCoupon;
        }

        public MailConfiguration getTrialCoupon()
        {
            return trialCoupon;
        }

        public void setTrialCoupon( MailConfiguration trialCoupon )
        {
            this.trialCoupon = trialCoupon;
        }

        public MailConfiguration getRegistration()
        {
            return registration;
        }

        public void setRegistration( MailConfiguration registration )
        {
            this.registration = registration;
        }

        public MailConfiguration getInvoice()
        {
            return invoice;
        }

        public void setInvoice( MailConfiguration invoice )
        {
            this.invoice = invoice;
        }

        public MailConfiguration getInvoiceDeath()
        {
            return invoiceDeath;
        }

        public void setInvoiceDeath( MailConfiguration invoiceDeath )
        {
            this.invoiceDeath = invoiceDeath;
        }

        public MailConfiguration getInvoicePaid()
        {
            return invoicePaid;
        }

        public void setInvoicePaid( MailConfiguration invoicePaid )
        {
            this.invoicePaid = invoicePaid;
        }

        public MailConfiguration getInvoicePaidParentChild()
        {
            return invoicePaidParentChild;
        }

        public void setInvoicePaidParentChild( MailConfiguration invoicePaidParentChild )
        {
            this.invoicePaidParentChild = invoicePaidParentChild;
        }

        public MailConfiguration getInvoicePending()
        {
            return invoicePending;
        }

        public void setInvoicePending( MailConfiguration invoicePending )
        {
            this.invoicePending = invoicePending;
        }

        public MailConfiguration getInvoiceReminder()
        {
            return invoiceReminder;
        }

        public void setInvoiceReminder( MailConfiguration invoiceReminder )
        {
            this.invoiceReminder = invoiceReminder;
        }

        public MailConfiguration getInvoiceSleep()
        {
            return invoiceSleep;
        }

        public void setInvoiceSleep( MailConfiguration invoiceSleep )
        {
            this.invoiceSleep = invoiceSleep;
        }

        public MailConfiguration getPasswordSet()
        {
            return passwordSet;
        }

        public void setPasswordSet( MailConfiguration passwordSet )
        {
            this.passwordSet = passwordSet;
        }

        public MailConfiguration getPasswordRecovery()
        {
            return passwordRecovery;
        }

        public void setPasswordRecovery( MailConfiguration passwordRecovery )
        {
            this.passwordRecovery = passwordRecovery;
        }

        public MailConfiguration getPasswordSetDone()
        {
            return passwordSetDone;
        }

        public void setPasswordSetDone( MailConfiguration passwordSetDone )
        {
            this.passwordSetDone = passwordSetDone;
        }

        public MailConfiguration getPasswordRecoveryDone()
        {
            return passwordRecoveryDone;
        }

        public void setPasswordRecoveryDone( MailConfiguration passwordRecoveryDone )
        {
            this.passwordRecoveryDone = passwordRecoveryDone;
        }

        public MailConfiguration getOrderNotifier()
        {
            return orderNotifier;
        }

        public void setOrderNotifier( MailConfiguration orderNotifier )
        {
            this.orderNotifier = orderNotifier;
        }

        public MailConfiguration getOrderApprovalCustomer()
        {
            return orderApprovalCustomer;
        }

        public void setOrderApprovalCustomer( MailConfiguration orderApprovalCustomer )
        {
            this.orderApprovalCustomer = orderApprovalCustomer;
        }

        public MailConfiguration getOrderCreationCustomer()
        {
            return orderCreationCustomer;
        }

        public void setOrderCreationCustomer( MailConfiguration orderCreationCustomer )
        {
            this.orderCreationCustomer = orderCreationCustomer;
        }

        @Deprecated
        public void setOrderCreation( MailConfiguration orderCreation )
        {
            this.orderCreationCustomer = orderCreation;
        }

        public MailConfiguration getOrderCreationPlatform()
        {
            return orderCreationPlatform;
        }

        public void setOrderCreationPlatform( MailConfiguration orderCreationPlatform )
        {
            this.orderCreationPlatform = orderCreationPlatform;
        }

        public MailConfiguration getOrderReject()
        {
            return orderReject;
        }

        public void setOrderReject( MailConfiguration orderReject )
        {
            this.orderReject = orderReject;
        }

        public MailConfiguration getOrderRequestCustomer()
        {
            return orderRequestCustomer;
        }

        public void setOrderRequestCustomer( MailConfiguration orderRequestCustomer )
        {
            this.orderRequestCustomer = orderRequestCustomer;
        }

        @Deprecated
        public void setOrderCreationVendor( MailConfiguration orderCreationVendor )
        {
            this.orderCreationPlatform = orderCreationVendor;
        }

        public MailConfiguration getOrderUndeployCustomer()
        {
            return orderUndeployCustomer;
        }

        public void setOrderUndeployCustomer( MailConfiguration orderUndeployCustomer )
        {
            this.orderUndeployCustomer = orderUndeployCustomer;
        }

        public MailConfiguration getOrderUndeployVendor()
        {
            return orderUndeployVendor;
        }

        public void setOrderUndeployVendor( MailConfiguration orderUndeployVendor )
        {
            this.orderUndeployVendor = orderUndeployVendor;
        }

        public MailConfiguration getSubscriptionAmendment()
        {
            return subscriptionAmendment;
        }

        public void setSubscriptionAmendment( MailConfiguration subscriptionAmendment )
        {
            this.subscriptionAmendment = subscriptionAmendment;
        }

        public MailConfiguration getSubscriptionAmendmentCustomer()
        {
            return subscriptionAmendmentCustomer;
        }

        public void setSubscriptionAmendmentCustomer( MailConfiguration subscriptionAmendmentCustomer )
        {
            this.subscriptionAmendmentCustomer = subscriptionAmendmentCustomer;
        }

        public MailConfiguration getDeployFailed()
        {
            return deployFailed;
        }

        public void setDeployFailed( MailConfiguration deployFailed )
        {
            this.deployFailed = deployFailed;
        }

        public MailConfiguration getDeployCompleteVendor()
        {
            return deployCompleteVendor;
        }

        public void setDeployCompleteVendor( MailConfiguration deployCompleteVendor )
        {
            this.deployCompleteVendor = deployCompleteVendor;
        }

        public MailConfiguration getDeployCompleteWithPostConfigurationVendor()
        {
            return deployCompleteWithPostConfigurationVendor;
        }

        public void setDeployCompleteWithPostConfigurationVendor(
                MailConfiguration deployCompleteWithPostConfigurationVendor )
        {
            this.deployCompleteWithPostConfigurationVendor = deployCompleteWithPostConfigurationVendor;
        }

        public MailConfiguration getDeployCompleteCustomer()
        {
            return deployCompleteCustomer;
        }

        public void setDeployCompleteCustomer( MailConfiguration deployCompleteCustomer )
        {
            this.deployCompleteCustomer = deployCompleteCustomer;
        }

        public MailConfiguration getApprovalRequest()
        {
            return approvalRequest;
        }

        public void setApprovalRequest( MailConfiguration approvalRequest )
        {
            this.approvalRequest = approvalRequest;
        }

        public MailConfiguration getStuckSubscription()
        {
            return stuckSubscription;
        }

        public void setStuckSubscription( MailConfiguration stuckSubscription )
        {
            this.stuckSubscription = stuckSubscription;
        }

        public MailConfiguration getSubscriptionTermAlarm()
        {
            return subscriptionTermAlarm;
        }

        public void setSubscriptionTermAlarm( MailConfiguration subscriptionTermAlarm )
        {
            this.subscriptionTermAlarm = subscriptionTermAlarm;
        }

        public MailConfiguration getVendorApproval()
        {
            return vendorApproval;
        }

        public void setVendorApproval( MailConfiguration vendorApproval )
        {
            this.vendorApproval = vendorApproval;
        }

        public MailConfiguration getVendorApprovalData()
        {
            return vendorApprovalData;
        }

        public void setVendorApprovalData( MailConfiguration vendorApprovalData )
        {
            this.vendorApprovalData = vendorApprovalData;
        }

        public MailConfiguration getProductApproval()
        {
            return productApproval;
        }

        public void setProductApproval( MailConfiguration productApproval )
        {
            this.productApproval = productApproval;
        }

        public MailConfiguration getProductApprovalData()
        {
            return productApprovalData;
        }

        public void setProductApprovalData( MailConfiguration productApprovalData )
        {
            this.productApprovalData = productApprovalData;
        }

        public MailConfiguration getVendorRegistration()
        {
            return vendorRegistration;
        }

        public void setVendorRegistration( MailConfiguration vendorRegistration )
        {
            this.vendorRegistration = vendorRegistration;
        }

        public MailConfiguration getVendorRegistrationNotification()
        {
            return vendorRegistrationNotification;
        }

        public void setVendorRegistrationNotification( MailConfiguration vendorRegistrationNotification )
        {
            this.vendorRegistrationNotification = vendorRegistrationNotification;
        }

        public MailConfiguration getCustomerPaymentMethodSave()
        {
            return customerPaymentMethodSave;
        }

        public void setCustomerPaymentMethodSave( MailConfiguration customerPaymentMethodSave )
        {
            this.customerPaymentMethodSave = customerPaymentMethodSave;
        }

        public MailConfiguration getCustomerRegistration()
        {
            return customerRegistration;
        }

        public void setCustomerRegistration( MailConfiguration customerRegistration )
        {
            this.customerRegistration = customerRegistration;
        }

        public MailConfiguration getCustomerUpdate()
        {
            return customerUpdate;
        }

        public void setCustomerUpdate( MailConfiguration customerUpdate )
        {
            this.customerUpdate = customerUpdate;
        }

        public MailConfiguration getCustomerPendingOrder()
        {
            return customerPendingOrder;
        }

        public void setCustomerPendingOrder( MailConfiguration customerPendingOrder )
        {
            this.customerPendingOrder = customerPendingOrder;
        }

        public MailConfiguration getBillingBudgetThresholdCrossed()
        {
            return billingBudgetThresholdCrossed;
        }

        public void setBillingBudgetThresholdCrossed( MailConfiguration billingBudgetThresholdCrossed )
        {
            this.billingBudgetThresholdCrossed = billingBudgetThresholdCrossed;
        }
        //endregion
    }

    public static class Translations
    {
        @NotNull
        @Valid
        private Translation unsubscribeLink;

        public Translation getUnsubscribeLink()
        {
            return unsubscribeLink;
        }

        public void setUnsubscribeLink( Translation unsubscribeLink )
        {
            this.unsubscribeLink = unsubscribeLink;
        }

        public static class Translation
        {
            @NotNull
            private Map<String, String> text;

            public String getText( String language )
                                                        {
                                                           return localize( text, language );
                                                                                             }

            public Map<String, String> getText()
                                                    {
                                                       return text;
                                                                   }

            public void setText( Map<String, String> text )
                                                               {
                                                                  this.text = text;
                                                                                   }
        }
    }

    private static String localize( Map<String, String> map, String language )
    {
        if ( map == null || language == null ) return null;
        String localized = map.get( language.toLowerCase() );
        if ( localized == null ) localized = map.get( DEFAULT_MAIL_LANGUAGE );
        return localized;
    }

}
