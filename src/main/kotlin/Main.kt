fun main(args: Array<String>) {
    val multimediaFacade = MultimediaFacade()

    val audioResult = multimediaFacade.playMedia("song.mp3", "audio")
    println(audioResult)

    val videoResult = multimediaFacade.playMedia("movie.mp4", "video")
    println(videoResult)

    val imageResult = multimediaFacade.playMedia("photo.jpg", "image")
    println(imageResult)

    val unsupportedResult = multimediaFacade.playMedia("document.pdf", "document")
    println(unsupportedResult)
}