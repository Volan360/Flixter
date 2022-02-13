# Flix
Flix is an app that allows users to browse movies from the [The Movie Database API](http://docs.themoviedb.apiary.io/#).

## Flix Part 2

### User Stories

#### REQUIRED (10pts)

- [x] (8pts) Expose details of movie (ratings using RatingBar, popularity, and synopsis) in a separate activity.
- [x] (2pts) Allow video posts to be played in full-screen using the YouTubePlayerView.

#### BONUS

- [x] Implement a shared element transition when user clicks into the details of a movie (1 point).
- [x] Add a rounded corners for the images using the Glide transformations. (1 point)

### App Walkthough GIF


<img src='flixer part 2 preview.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />


## Open-source libraries used
- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Android

---

## Flix Part 1

### User Stories

#### REQUIRED (10pts)
- [x] (10pts) User can view a list of movies (title, poster image, and overview) currently playing in theaters from the Movie Database API.

#### BONUS
- [x] (2pts) Views should be responsive for both landscape/portrait mode.
   - [x] (1pt) In portrait mode, the poster image, title, and movie overview is shown.
   - [x] (1pt) In landscape mode, the rotated alternate layout should use the backdrop image instead and show the title and movie overview to the right of it.
- [x] (2pts) Improved the user interface by experimenting with styling and coloring.

### App Walkthough GIF

<img src='Flixer preview.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />

<img src='Flixer landscape preview.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />


### Notes
For almost 2 hours I didn't realize that the emulator had auto-rotate turned off by deafault, so I kept trying to make changes to the way I was approaching landscape configurations. I think that would be a good thing to mention in the project specs so no one else does that.

### Open-source libraries used

- [Android Async HTTP](https://github.com/codepath/CPAsyncHttpClient) - Simple asynchronous HTTP requests with JSON parsing
- [Glide](https://github.com/bumptech/glide) - Image loading and caching library for Androids
