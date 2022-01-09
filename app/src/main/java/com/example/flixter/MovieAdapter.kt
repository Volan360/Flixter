package com.example.flixter

import android.content.Context
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MovieAdapter(private val context: Context, private val movies: MutableList<Movie>):

    RecyclerView.Adapter<MovieAdapter.ViewHolder>() {

    //expensive operation
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

      val view = LayoutInflater.from(context).inflate(R.layout.item_movie, parent, false)


        return ViewHolder(view)
    }
    //much cheaper
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val movie = movies[position]
        holder.bind(movie)
        holder.itemView.animation =
            AnimationUtils.loadAnimation(holder.itemView.context, R.anim.anim_1)


    }

    override fun getItemCount() = movies.size

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        private val ivPoster = itemView.findViewById<ImageView>(R.id.ivPoster)
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        private val tvOverview = itemView.findViewById<TextView>(R.id.tvOverview)
        fun bind(movie: Movie){
            tvTitle.text = movie.title
            tvOverview.text = movie.overview
            if(Resources.getSystem().configuration.orientation == Configuration.ORIENTATION_PORTRAIT){
                Glide.with(context).load(movie.posterImageUrl).into(ivPoster)
                }
            if(Resources.getSystem().configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){
                Glide.with(context).load(movie.backdropImageUrl).into(ivPoster)
            }
        }
    }

}
