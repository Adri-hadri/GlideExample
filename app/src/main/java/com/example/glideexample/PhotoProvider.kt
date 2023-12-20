package com.example.glideexample

object PhotoProvider {

    private val photos = listOf(
        "https://cdn.britannica.com/86/192386-050-D7F3126D/Muhammad-Ali-American.jpg",
//        "https://people.com/thmb/V5S2bcUySqishDrPFJsmvqvq5bQ=/1500x0/filters:no_upscale():max_bytes(150000):strip_icc():focal(687x0.689x2)/gettyimages-823663584_preview-58150fced44d40418bf7bfed4dad78f6.jpg",
//        "http://cdn.sanity.io/images/dm4o0ui7/production/ab8622774dfd8bc6b210765cc1d648ff48279b3-1200x600.png?w=1200&h=600&auto=format",
//        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRHY-ZRs4_6KrBR-kAaVr5TSVc1hXHe6En7-UOV5nSPQHPm6dnJ6LQR6Zl79klyzYvfHzc&usqp=CAU",
        "https://hips.hearstapps.com/hmg-prod/images/the-american-singer-tina-turner-at-her-home-in-london-news-photo-1684956673.jpg",
        "https://en.wikipedia.org/wiki/File:David-Bowie_Chicago_2002-08-08_photoby_Adam-Bielawski-cropped.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/5/5e/Massimo_Savi%C4%87_-_%C5%A0panciranje_2013._%289584284840%29.jpg/220px-Massimo_Savi%C4%87_-_%C5%A0panciranje_2013._%289584284840%29.jpg"
    )

    fun generateRandomPictureUrl(): String = photos.shuffled()[0]
}