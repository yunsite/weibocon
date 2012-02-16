package weibocon.org;

import java.util.List;

import android.database.Cursor;

/*
 * 微博数据库接口
 */
public interface IWeiBoDB {

	/*
	 * 获取 user
	 */
	public Cursor GetUserInfo1();
	/*
	 * 添加user
	 */
	public Boolean AddUser(UserInfo user);
	/*
	 * 获取user
	 */
	public List<UserInfo> GetUserInfo();
	/*
	 * 更新user
	 */
	public Boolean UpdateUserInfo(UserInfo user);
	/*
	 * 删除user
	 */
	public Boolean DeleteUserInfo(UserInfo user);
	/*
	 * 获取微博消息
	 */
	public List<Status> GetStatus(Integer page, Integer uid);
	/*
	 * 删除指定id的微博
	 */
	public Boolean DeleteStatus(Integer id);
	/*
	 * 添加微博
	 */
	public Boolean AddStatus(List<Status> statusList);
	/*
	 * 添加tag
	 */
	public Boolean AddTag(List<Tag> tagList);
	/*
	 * 获取tag
	 */
	public List<Tag> GetTag(Integer page,Integer uid);
	/*
	 * 添加关注对象
	 */
	public Boolean AddFriends(List<Friends> friendsList);
	/*
	 * 获取货主对象
	 */
	public List<Friends> GetFriends(Integer uid);
	/*
	 * 删除指定的关注对象
	 */
	public Boolean DeleteFriends(Integer friendsID);
	/*
	 * 获取指定微博的评论
	 */
	public List<Comments> GetComments(Integer status_id);
	/*
	 * 删除指定id的评论
	 */
	public Boolean DeleteComments(Integer commentID);
	/*
	 * 获取表情
	 */
	public List<Emotion> GetEmoton();
	/*
	 * 添加表情
	 */
	public Boolean AddEmotion(List<Emotion> emotionList);
	/*
	 * 添加教育经历
	 */
	public Boolean AdEducation(List<Education> educationList);
	/*
	 * 获取指定user的教育经历
	 */
	public List<Education> GetEducation(Integer uid);
	/*
	 * 更新教育经历
	 */
	public Boolean UpdateEducation(List<Education> educationList);
	/*
	 * 添加地址编码砖汉表
	 */
	public Boolean AddCode_Location(List<Code_Location> code_LocationList);
	/*
	 * 获取地址码转换表
	 */
	public List<Code_Location> GetCode_Location();
	/*
	 * 添加粉丝
	 */
	public Boolean AddFollowers(List<Followers> followersList);
	/*
	 * 获取指定user的粉丝
	 */
	public List<Followers> GetFollowers(Integer uid);
	/*
	 * 删除指定id的粉丝
	 */
	public Boolean DeleteFollowers(Integer followersID);
	/*
	 * 添加私信
	 */
	public Boolean AddMessages(List<Messages> messageList);
	/*
	 * 获取指定user的私信
	 */
	public List<Messages> GetMessages(Integer uid,Integer page);
	
	
	
	
}
