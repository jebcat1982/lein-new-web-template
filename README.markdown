# lein-new-web-template

A Leiningen template for Noir + ClojureScript projects.

Forked from Chris Granger's version to add/change the following:

* Remove garbage css files.
* A Less.js and a style.less ready to build on.
* A `templates.clj` so we don't mix templating with logic.
* An `.hgignore` and `.gitignore` with appropriate contents.
* Twitter bootstrap, with icons.
* A base Hiccup template that includes all the magic media paths in the right
  places.
* Lobos migrations with the magic fairy dust needed to work with SQLite.
* Korma DB defined (will work with SQLite too).

TODO:

* Lobos migrations and Korma declarations ready to work with both SQLite and
  Heroku's Postgres.
* Right now lein-newnew corrupts the images when copying them.  Hopefully that
  will be fixed at some point.
