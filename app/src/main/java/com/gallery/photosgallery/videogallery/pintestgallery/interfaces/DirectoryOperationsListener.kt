package com.gallery.photosgallery.videogallery.pintestgallery.interfaces

import com.gallery.photosgallery.videogallery.pintestgallery.models.Directory
import java.io.File

interface DirectoryOperationsListener {
    fun refreshItems()

    fun deleteFolders(folders: ArrayList<File>)

    fun recheckPinnedFolders()

    fun updateDirectories(directories: ArrayList<Directory>)
}
