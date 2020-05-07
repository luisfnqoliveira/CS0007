---
layout: page
title: Exercises
permalink: /exercises/
ignore: true
---

On this page, you will find some practice exercises!

{% for exercise in site.exercises %}
{% unless exercise.ignore or exercise.ignore == true %}

# [{{ exercise.title }}: {{ exercise.subtitle}}]({{ site.baseurl}}{{ exercise.url }})

{{ exercise.summary }}

{% endunless %}
{% endfor %}
