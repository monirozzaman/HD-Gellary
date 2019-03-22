package com.itvillagerr.cameraroll.adapter.main.viewHolder;

import android.view.View;
import android.widget.ImageView;

import com.itvillagerr.cameraroll.R;
import com.itvillagerr.cameraroll.data.models.Album;
import com.itvillagerr.cameraroll.ui.widget.ParallaxImageView;

public class SimpleAlbumHolder extends AlbumHolder {

    public SimpleAlbumHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void setAlbum(Album album) {
        super.setAlbum(album);
        final ImageView image = itemView.findViewById(R.id.image);
        if (image instanceof ParallaxImageView) {
            ((ParallaxImageView) image).setParallaxTranslation();
        }
        loadImage(image);
    }
}
