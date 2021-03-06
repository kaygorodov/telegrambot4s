package info.mukel.telegrambot4s.models

/** This object represents a chat.
  *
  * @param id           Integer Unique identifier for this chat, not exceeding 1e13 by absolute value
  * @param type         String Type of chat, can be either "private", "group", "supergroup" or "channel"
  * @param title        String Optional Title, for channels and group chats
  * @param username     String Optional Username, for private chats and channels if available
  * @param firstName    String Optional First name of the other party in a private chat
  * @param lastName     String Optional Last name of the other party in a private chat
  * @param allMembersAreAdministrators  Boolean Optional. True if a group has 'All Members Are Admins' enabled.
  * @param photo        ChatPhoto	Optional. Chat photo. Returned only in getChat.
  * @param description  String Optional. Description, for supergroups and channel chats. Returned only in getChat.
  * @param inviteLink	  String Optional. Chat invite link, for supergroups and channel chats. Returned only in getChat.
  */
case class Chat(
                 id          : Long,
                 `type`      : ChatType.ChatType,
                 title       : Option[String] = None,
                 username    : Option[String] = None,
                 firstName   : Option[String] = None,
                 lastName    : Option[String] = None,
                 allMembersAreAdministrators : Option[Boolean] = None,
                 photo       : Option[ChatPhoto] = None,
                 description : Option[String] = None,
                 inviteLink  : Option[String] = None
               )
