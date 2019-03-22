package com.itvillagerr.cameraroll.adapter.album.viewHolder;

import android.view.View;
import android.widget.ImageView;

import com.itvillagerr.cameraroll.R;
import com.itvillagerr.cameraroll.data.models.AlbumItem;

public class VideoViewHolder extends AlbumItemHolder {

    public VideoViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    int getIndicatorDrawableResource() {
        return R.drawable.video_indicator;
    }

    @Override
    public void loadImage(final ImageView imageView, final AlbumItem albumItem) {
        super.loadImage(imageView, albumItem);
    }
}
