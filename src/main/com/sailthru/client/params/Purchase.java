package com.sailthru.client.params;

import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.sailthru.client.ApiAction;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class Purchase extends AbstractApiParams implements ApiParams {

    public enum Channel {app, offline, online}

    protected String email;
    protected List<Map<String, Object>> items;
    protected Integer incomplete;

    @SerializedName("message_id")
    protected String messageId;

    @SerializedName("cookies")
    protected Map<String, String> cookies;

    @SerializedName("reminder_template")
    protected String reminderTemplate;

    @SerializedName("reminder_time")
    protected String reminderTime;

    @SerializedName("send_template")
    protected String sendTemplate;

    protected String date;

    protected List<Map<String, Object>> tenders;
    protected List<Map<String, Object>> adjustments;
    protected Map<String, Object> vars;

    @SerializedName("purchase_keys")
    protected Map<String, String> purchaseKeys;

    @SerializedName("channel")
    protected Channel channel;

    @SerializedName("app_id")
    protected String appId;

    @SerializedName("device_id")
    protected String deviceId;

    @SerializedName("user_agent")
    protected String userAgent;

    public Purchase setEmail(String email) {
        this.email = email;
        return this;
    }

    public Purchase setItems(List<PurchaseItem> items) {
        this.items = new ArrayList<Map<String, Object>>();
        for (PurchaseItem item : items) {
            this.items.add(item.toHashMap());
        }
        return this;
    }

    public Purchase setCookies(Map<String, String> cookies) {
        this.cookies = cookies;
        return this;
    }

    public Purchase setTenders(List<Map<String, Object>> tenders) {
        this.tenders = tenders;
        return this;
    }

    public Purchase setAdjustments(List<Map<String, Object>> adjustments) {
        this.adjustments = adjustments;
        return this;
    }

    public Purchase setAsIncomplete() {
        this.incomplete = 1;
        return this;
    }

    public Purchase setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }

    public Purchase setReminderTemplate(String reminderTemplate) {
        this.reminderTemplate =  reminderTemplate;
        return this;
    }

    public Purchase setReminderTime(Date reminderTime) {
        this.reminderTime = reminderTime.toString();
        return this;
    }

    public Purchase setReminderTime(String reminderTime) {
        this.reminderTime = reminderTime;
        return this;
    }

    public Purchase setDate(Date date) {
        this.date = date.toString();
        return this;
    }

    public Purchase setDate(String date) {
        this.date = date;
        return this;
    }

    public Purchase setSendTemplate(String sendTemplate) {
        this.sendTemplate = sendTemplate;
        return this;
    }

    public Purchase setPurchaseLevelVars(Map<String, Object> vars) {
        this.vars = vars;
        return this;
    }

    public Type getType() {
        Type type = new TypeToken<Purchase>() {}.getType();
        return type;
    }

    public Purchase setPurchaseKeys(Map<String, String> purchaseKeys) {
        this.purchaseKeys = purchaseKeys;
        return this;
    }

    public Channel getChannel() {
        return channel;
    }

    public Purchase setChannel(Channel channel) {
        this.channel = channel;
        return this;
    }

    public String getAppId() {
        return appId;
    }

    public Purchase setAppId(String appId) {
        this.appId = appId;
        return this;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public Purchase setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public Purchase setUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    @Override
    public ApiAction getApiCall() {
        return ApiAction.purchase;
    }

}
