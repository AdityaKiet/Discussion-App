package imposo.com.application.constants;

public interface NetworkConstants {
	
	public final String GET_NETWORK_IP = "http://45.55.229.252:8080/DiscussionApp";
    public final String GET_IMAGE_NETWORK_IP ="http://45.55.229.252:8080/DiscussionApp/images/";

	public final String LOGIN_SERVLET = "/Login";
	public final String SEND_OTP_SERVLET = "/SendOTP";
	public final String CONFIRM_OTP_SERVLET ="/ConfirmOTP";
	public final String UPLOAD_IMAGE_SERVLET ="/UpdateProfilePicture";
	public final String UPDATE_GCM_ID_SERVLET = "/UpdateGCMID";
	public final String LIKE_SERVLET = "/LikeFeed";
    public final String UNLIKE_SERVLET = "/DelikeFeed";
    public final String UPDATE_USER_INFO_SERVLET = "/UpdateUserInfo";
	public final String INSERT_NEW_FEED = "/InsertNewFeed";
    public final String INSERT_COMMENT = "/PostComment";
	public final String LIKE_COMMENT = "/LikeComment";
	public final String LIKE_COMMENT_REPLY = "/LikeCommentReply";
	public final String DELIKE_COMMENT_REPLY = "/DelikeCommentReply";
	public final String UNLIKE_COMMENT = "/DelikeComment";
	public final String POST_REPLY = "/PostCommentReply";

	public final String GOOGLE_PROJ_ID = "561135762715";
	public final String APP_STRING_URL = "/gcm/gcm.php?shareRegId=true";
	public final String MSG_KEY = "m";
}
