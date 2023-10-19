package com.gallery.photosgallery.videogallery.pintestgallery.extensions

import com.gallery.photosgallery.videogallery.pintestgallery.extensions.isDownloadsFolder
import com.simplemobiletools.commons.models.FileDirItem

fun FileDirItem.isDownloadsFolder() = path.isDownloadsFolder()
