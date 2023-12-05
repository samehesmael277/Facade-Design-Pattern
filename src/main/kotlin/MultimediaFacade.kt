import java.util.*

// Facade - MultimediaFacade
class MultimediaFacade(
    private val audioPlayer: AudioPlayer = AudioPlayer(),
    private val videoPlayer: VideoPlayer = VideoPlayer(),
    private val imageViewer: ImageViewer = ImageViewer()
) {
    fun playMedia(fileName: String, mediaType: String): String {
        return when (mediaType.lowercase(Locale.getDefault())) {
            "audio" -> audioPlayer.playAudio(fileName)
            "video" -> videoPlayer.playVideo(fileName)
            "image" -> imageViewer.displayImage(fileName)
            else -> "Unsupported media type"
        }
    }
}
