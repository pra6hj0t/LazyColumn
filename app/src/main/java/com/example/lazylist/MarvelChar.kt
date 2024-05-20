package com.example.lazylist

data class MarvelChar(
    var name :String,
    var image : Int
)

fun getAllMarvelChars() : List<MarvelChar> {
return listOf<MarvelChar>(
    MarvelChar("Thor",R.drawable.thor),
    MarvelChar("Iron Man",R.drawable.iron),
    MarvelChar("Caption America",R.drawable.cap) ,
    MarvelChar("Thor",R.drawable.thor),
    MarvelChar("Iron Man",R.drawable.iron),
    MarvelChar("Caption America",R.drawable.cap),
    MarvelChar("Thor",R.drawable.thor),
    MarvelChar("Iron Man",R.drawable.iron),
    MarvelChar("Caption America",R.drawable.cap),
    MarvelChar("Thor",R.drawable.thor),
    MarvelChar("Iron Man",R.drawable.iron),
    MarvelChar("Caption America",R.drawable.cap),
    MarvelChar("Thor",R.drawable.thor),
    MarvelChar("Iron Man",R.drawable.iron),
    MarvelChar("Caption America",R.drawable.cap)
)
}

