---
layout: page
title: Projects
permalink: /projects/
---

On this page, you will see our course projects.

{% for project in site.projects %}

{% unless project.ignore or project.ignore == true %}

{% if project.solution %}

**Solution**: [{{ project.title }} Solution]({{site.baseurl }}{{ project.url }})

{% else %}
# [{{ project.title }}: {{ project.subtitle }}]({{ site.baseurl }}{{ project.url }})

**Released**: {{ project.released }}

{% if project.extended %}
**Due**: ~~{{ project.due }}~~

**Extended**: {{ project.extended }}
{% else %}
**Due**: {{ project.due }}
{% endif %}

{{ project.summary }}
{% endif %}

{% endunless %}

{% endfor %}
