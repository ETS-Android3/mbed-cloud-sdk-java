package com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.api;

import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.ApiClient;
import com.arm.mbed.cloud.sdk.lowlevel.pelionclouddevicemanagement.model.Webhook;
import org.junit.Before;
import org.junit.Test;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private NotificationsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotificationsApi.class);
    }

    /**
     * (PREVIEW) Open the websocket.
     *
     * (PREVIEW) A websocket channel can have only one active connection at a time. If a websocket connection for a
     * channel exists and a new connection to the same channel is made, the connection is accepted and the older
     * connection is closed. Once the socket has been opened, it may be closed with one of the following status codes.
     * &lt;table&gt; &lt;thead&gt; &lt;tr&gt; &lt;th&gt;Code&lt;/th&gt; &lt;th&gt;Description&lt;/th&gt; &lt;/tr&gt;
     * &lt;/thead&gt; &lt;tbody&gt; &lt;tr&gt; &lt;td&gt;&lt;b&gt;1000&lt;/b&gt;&lt;/td&gt; &lt;td&gt;Socket closed by
     * the client.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;b&gt;1001&lt;/b&gt;&lt;/td&gt; &lt;td&gt;Going away.
     * Set when another socket opens on the used channel, the channel is deleted with a REST call, or the server is
     * shutting down.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt; &lt;td&gt;&lt;b&gt;1008&lt;/b&gt;&lt;/td&gt; &lt;td&gt;Policy
     * violation. Set when the API key is missing or invalid.&lt;/td&gt; &lt;/tr&gt; &lt;tr&gt;
     * &lt;td&gt;&lt;b&gt;1011&lt;/b&gt;&lt;/td&gt; &lt;td&gt;Unexpected condition. Socket is closed with this status at
     * an attempt to open a socket to a nonexistent channel (without a prior PUT request). This code is also used to
     * indicate closing socket for any other unexpected condition in the server.&lt;/td&gt; &lt;/tr&gt; &lt;/tbody&gt;
     * &lt;/table&gt; **Example:** &#x60;&#x60;&#x60; curl -X GET
     * https://api.us-east-1.mbedcloud.com/v2/notification/websocket-connect \\ -H \&quot;Authorization:Bearer
     * {apikey}\&quot; \\ -H \&quot;Connection:upgrade\&quot; \\ -H \&quot;Upgrade:websocket\&quot; \\ -H
     * \&quot;Sec-WebSocket-Version: 13\&quot; \\ -H \&quot;Sec-WebSocket-Key: {base64nonce}\&quot; \\ -N -I
     * &#x60;&#x60;&#x60;
     */
    @Test
    public void connectWebsocketTest() {
        String connection = null;
        String upgrade = null;
        String origin = null;
        Integer secWebSocketVersion = null;
        String secWebSocketKey = null;
        String secWebSocketProtocol = null;
        // Void response = api.connectWebsocket(connection, upgrade, origin, secWebSocketVersion, secWebSocketKey,
        // secWebSocketProtocol);

        // TODO: test validations
    }

    /**
     * Delete notification Long Poll channel.
     *
     * Delete a notification Long Poll channel. This is required to change the channel from Long Poll to another type.
     * Do not make a GET &#x60;/v2/notification/pull&#x60; call for two minutes after deleting the channel, because it
     * can implicitly recreate the pull channel. You can also have some random responses with payload or 410 GONE with
     * \&quot;CHANNEL_DELETED\&quot; as a payload or 200/204 until the old channel is purged. **Example:**
     * &#x60;&#x60;&#x60; curl -X DELETE https://api.us-east-1.mbedcloud.com/v2/notification/pull \\ -H
     * &#39;Authorization: Bearer &lt;api_key&gt;&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void deleteLongPollChannelTest() {
        // Void response = api.deleteLongPollChannel();

        // TODO: test validations
    }

    /**
     * (PREVIEW) Delete websocket channel.
     *
     * (PREVIEW) Delete a notification websocket channel bound to the API key. This is required to change the channel
     * from websocket to another type. **Example:** &#x60;&#x60;&#x60; curl -X DELETE
     * https://api.us-east-1.mbedcloud.com/v2/notification/websocket \\ -H &#39;Authorization: Bearer
     * &lt;api_key&gt;&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void deleteWebsocketTest() {
        // Void response = api.deleteWebsocket();

        // TODO: test validations
    }

    /**
     * Delete callback URL.
     *
     * Deletes the callback URL. **Example:** &#x60;&#x60;&#x60; curl -X DELETE
     * https://api.us-east-1.mbedcloud.com/v2/notification/callback \\ -H &#39;Authorization: Bearer
     * &lt;api_key&gt;&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void deregisterWebhookTest() {
        // Void response = api.deregisterWebhook();

        // TODO: test validations
    }

    /**
     * Get channel metadata.
     *
     * Get channel delivery mechanism. **Example:** curl -X GET
     * https://api.us-east-1.mbedcloud.com/v2/notification/channel \\ -H &#39;Authorization: Bearer &lt;api_key&gt;&#39;
     * \\
     */
    @Test
    public void getChannelMetadataTest() {
        // ChannelMetadata response = api.getChannelMetadata();

        // TODO: test validations
    }

    /**
     * Check callback URL.
     *
     * Shows the current callback URL if it exists. **Example:** &#x60;&#x60;&#x60; curl -X GET
     * https://api.us-east-1.mbedcloud.com/v2/notification/callback \\ -H &#39;Authorization: Bearer
     * &lt;api_key&gt;&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void getWebhookTest() {
        // Webhook response = api.getWebhook();

        // TODO: test validations
    }

    /**
     * (PREVIEW) Get websocket channel information.
     *
     * (PREVIEW) Returns 200 with websocket connection status, if websocket channel exists. **Example:**
     * &#x60;&#x60;&#x60; curl -X GET https://api.us-east-1.mbedcloud.com/v2/notification/websocket \\ -H
     * &#39;Authorization: Bearer &lt;api_key&gt;&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void getWebsocketTest() {
        // WebsocketChannel response = api.getWebsocket();

        // TODO: test validations
    }

    /**
     * Get notifications using Long Poll
     *
     * In this case, notifications are delivered through HTTP long poll requests. The HTTP request is kept open until
     * one or more event notifications are delivered to the client, or the request times out (response code 204). In
     * both cases, the client should open a new polling connection after the previous one closes. Only a single long
     * polling connection per API key can be ongoing at any given time. We recommend using a persistent connection
     * (Connection keep-alive header in the request) to avoid excess TLS handshakes. The pull channel is implicitly
     * created by the first GET call to &#x60;/v2/notification/pull&#x60;. It refreshes on each GET call. If the channel
     * is not polled for a long time (10 minutes), it expires and is deleted. This means that no notifications will stay
     * in the queue between polls. A channel can be also be deleted explicitly with a DELETE call. **Note:** If you
     * cannot have a public-facing callback URL, for example, when developing on your local machine, you can use long
     * polling to check for new messages. However, **long polling is deprecated** and will likely be replaced in the
     * future. It is meant only for experimentation, not commercial use. The proper method to receive notifications is a
     * **notification callback**. There can only be one notification channel per API key in Device Management Connect.
     * If a notification channel of other type already exists for the API key, delete it before creating a long poll
     * notification channel. **Example:** &#x60;&#x60;&#x60; curl -X GET
     * https://api.us-east-1.mbedcloud.com/v2/notification/pull \\ -H &#39;Authorization: Bearer &lt;api_key&gt;&#39;
     * &#x60;&#x60;&#x60;
     */
    @Test
    public void longPollNotificationsTest() {
        // NotificationMessage response = api.longPollNotifications();

        // TODO: test validations
    }

    /**
     * Register a callback URL.
     *
     * Register a URL to which the server delivers notifications of changes to the subscribed resource. To push
     * notifications, you must first place subscriptions. The maximum length of the URL, header keys, and values, all
     * combined, is 400 characters. Notifications are delivered as PUT requests to the HTTP server, which the client
     * defines with a subscription server message. The given URL must be accessible, and respond to the PUT request with
     * a response code of 200 or 204. Device Management Connect tests the callback URL with an empty JSON payload
     * &#x60;{}&#x60; when the URL is registered. Callback implementation does not support URL redirection. For more
     * information on notification messages, see [NotificationMessage](#NotificationMessage). **Optional headers in a
     * callback message:** You can set optional headers to a callback in a **Webhook** object. Device Management Connect
     * includes the header and key pairs in the notification messages send them to callback URL. The callback URLs and
     * headers are API key-specific. One possible use for additional headers is checking the origin of a PUT request, as
     * well as distinguishing the application (API key) to which the notification belongs. **Note**: Only one callback
     * URL per API key can be active. If you register a new URL while another one is active, it replaces the active one.
     * There can be only one notification channel at a time. If another type of channel is already present, you need to
     * delete it before setting the callback URL. **Expiration of a callback URL:** A callback can expire when Device
     * Management cannot deliver a notification due to a connection timeout or an error response (4xx or 5xx). After
     * each delivery failure, Device Management sets an exponential back off time and makes a retry attempt after that.
     * The first retry delay is 1 second, then 2s, 4s, 8s, up to maximum delay of two minutes. The callback URL is
     * removed if all retries fail within 24 hours. More about [notification sending
     * logic](../integrate-web-app/event-notification.html#notification-sending-logic). **Supported callback URL
     * protocols:** Currently, only HTTP and HTTPS protocols are supported. **HTTPS callback URLs:** When delivering a
     * notification to an HTTPS based callback URL, Device Management Connect presents a valid client certificate to
     * identify itself. The certificate is signed by a trusted certificate authorithy (GlobalSign) with a Common Name
     * (CN) set to notifications.mbedcloud.com. **Configuration options:** The event notification channel provides
     * configurations options defined in [Serialization config](#SerializationConfigObjectV2). **Example:** This example
     * command shows how to set your callback URL and API key. It also sets an optional header authorization. When
     * Device Management Connect calls your callback URL, the call contains the authorization header with the defined
     * value. &#x60;&#x60;&#x60; curl -X PUT https://api.us-east-1.mbedcloud.com/v2/notification/callback \\ -H
     * &#39;Authorization: Bearer &lt;api_key&gt;&#39; \\ -H &#39;content-type: application/json&#39; \\ -d &#39;{
     * \&quot;url\&quot;: \&quot;{callback-url}\&quot;, \&quot;headers\&quot;: {\&quot;authorization\&quot;:
     * \&quot;f4b93d6e-4652-4874-82e4-41a3ced0cd56\&quot;}, \&quot;serialization\&quot;: {\&quot;type\&quot;:
     * \&quot;v2\&quot;, \&quot;max_chunk_size\&quot;: \&quot;100\&quot;, \&quot;cfg\&quot;:
     * {\&quot;deregistrations_as_object\&quot;: \&quot;true\&quot;, \&quot;include_uid\&quot;: \&quot;true\&quot;,
     * \&quot;include_timestamp\&quot;: \&quot;true\&quot;, \&quot;include_original_ep\&quot;: \&quot;true\&quot; } }
     * }&#39; &#x60;&#x60;&#x60;
     */
    @Test
    public void registerWebhookTest() {
        Webhook webhook = null;
        // Void response = api.registerWebhook(webhook);

        // TODO: test validations
    }

    /**
     * (PREVIEW) Register a websocket channel.
     *
     * (PREVIEW) Register (or update) a channel using websocket connection to deliver notifications. The websocket
     * channel should be opened by client using &#x60;/v2/notification/websocket-connect&#x60; endpoint. To get
     * notifications pushed, you must place subscriptions. For more information on notification messages, see
     * [NotificationMessage](#NotificationMessage). A websocket channel can have only one active websocket connection at
     * a time. If a websocket connection for a channel exists and a new connection to the same channel is made, the
     * connection is accepted and the older connection is closed. **Expiration of a websocket:** A websocket channel is
     * expired if the channel does not have an opened websocket connection for a 24-hour period. Channel expiration
     * means the channel is deleted and any undelivered notifications stored in its internal queue is removed. As long
     * as the channel has an opened websocket connection or time between successive websocket connections is less than
     * 24 hours, the channel is considered active, notifications are stored in its internal queue and delivered when a
     * websocket connection is active. A channel can be also deleted explicitly with a DELETE call. More about
     * [notification sending logic](../integrate-web-app/event-notification.html#notification-sending-logic).
     * **Configuration options:** The event notification channel provides configurations options defined in
     * [Serialization config](#SerializationConfigObjectV2) **Example:** &#x60;&#x60;&#x60; curl -X PUT
     * https://api.us-east-1.mbedcloud.com/v2/notification/websocket \\ -H &#39;Authorization: Bearer
     * &lt;api_key&gt;&#39; -d &#39;{ \&quot;serialization\&quot;: {\&quot;type\&quot;: \&quot;v2\&quot;,
     * \&quot;max_chunk_size\&quot;: \&quot;100\&quot;, \&quot;cfg\&quot;: {\&quot;deregistrations_as_object\&quot;:
     * \&quot;true\&quot;, \&quot;include_uid\&quot;: \&quot;true\&quot;, \&quot;include_timestamp\&quot;:
     * \&quot;true\&quot;, \&quot;include_original_ep\&quot;: \&quot;true\&quot; } } } &#x60;&#x60;&#x60;
     */
    @Test
    public void registerWebsocketTest() {
        // RegisterWebsocketChannel response = api.registerWebsocket();

        // TODO: test validations
    }
}
