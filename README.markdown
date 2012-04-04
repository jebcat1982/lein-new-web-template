# lein-new-web-template

A Leiningen template for Noir + ClojureScript projects.

Forked from Chris Granger's version to add/change the following:

* Remove garbage css files.
* A Less.js and a style.less ready to build on.
* A `templates.clj` so we don't mix templating with logic.
* An `.hgignore`.
* Twitter bootstrap.
* Lobos migrations with the magic fairy dust needed to work with SQLite.
* Korma DB defined (will work with SQLite too).

TODO:

* Lobos migrations and Korma declarations ready to work with both SQLite and
  Heroku's Postgres.
