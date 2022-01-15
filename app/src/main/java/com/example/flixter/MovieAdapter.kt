package com.example.flixter

import android.content.Context
import android.content.Intent
import android.content.res.Configuration
import android.content.res.Resources
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

const val MOVIE_EXTRA = "MOVIE_EXTRA"
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


    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener{
        private val ivPoster = itemView.findViewById<ImageView>(R.id.ivPoster)
        private val tvTitle = itemView.findViewById<TextView>(R.id.tvTitle)
        private val tvOverview = itemView.findViewById<TextView>(R.id.tvOverview)

        init{
            itemView.setOnClickListener(this)
        }

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

        override fun onClick(p0: View?) {
            // 1. Get notified of which movie was clicked
            val movie = movies[adapterPosition]
            // 2. Use the intent system to open the new activity
            val intent = Intent(context, DetailActivity::class.java)
            intent.putExtra(MOVIE_EXTRA, movie)
            //pass in movie
            context.startActivity(intent)
        }
    }

}
