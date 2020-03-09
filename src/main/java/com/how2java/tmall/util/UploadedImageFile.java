package com.how2java.tmall.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by kaiyiwang on 20/3/10.
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }
}
