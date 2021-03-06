package info.mukel.telegrambot4s.methods

/**
  * Use this method to export an invite link to a supergroup or a channel.
  * The bot must be an administrator in the chat for this to work and must have the appropriate admin rights.
  * Returns exported invite link as String on success.
  *
  * @param chatId	Integer or String Unique identifier for the target chat or username of the target channel (in the format @channelusername)
  */
case class ExportChatInviteLink(
                                 chatId : Either[Long, String]
                               ) extends ApiRequestJson[String]
