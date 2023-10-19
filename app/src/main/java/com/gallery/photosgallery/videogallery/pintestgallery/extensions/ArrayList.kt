package com.gallery.photosgallery.videogallery.pintestgallery.extensions

import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_GIFS
import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_IMAGES
import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_PORTRAITS
import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_RAWS
import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_SVGS
import com.gallery.photosgallery.videogallery.pintestgallery.helpers.TYPE_VIDEOS
import com.gallery.photosgallery.videogallery.pintestgallery.models.Medium

fun ArrayList<Medium>.getDirMediaTypes(): Int {
    var types = 0
    if (any { it.isImage() }) {
        types += TYPE_IMAGES
    }

    if (any { it.isVideo() }) {
        types += TYPE_VIDEOS
    }

    if (any { it.isGIF() }) {
        types += TYPE_GIFS
    }

    if (any { it.isRaw() }) {
        types += TYPE_RAWS
    }

    if (any { it.isSVG() }) {
        types += TYPE_SVGS
    }

    if (any { it.isPortrait() }) {
        types += TYPE_PORTRAITS
    }

    return types
}
