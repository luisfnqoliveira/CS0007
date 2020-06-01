---
layout: page
title: Labs
permalink: /labs/
---

On this page, you will see our labs.
These are meant to be short weekly assignments that reenforce the knowledge we've learned in class.
Each one will be assigned before the recitations and will be due in the end of the recitation.
Any deviations to that will be announced with the corresponding lab.

{% for lab in site.labs %}

{% unless lab.ignore or lab.ignore == true %}

{% if lab.solution %}

**Solution**: [{{ lab.title }} Solution]({{site.baseurl}}{{ lab.url }})

{% else %}
# [{{ lab.title }}: {{ lab.subtitle}}]({{ site.baseurl}}{{ lab.url }})

**Released**: {{ lab.released }}

{% if lab.extended %}
**Due**: ~~{{ lab.due }}~~

**Extended**: {{ lab.extended }}
{% else %}
**Due**: {{ lab.due }}
{% endif %}

{{ lab.summary }}
{% endif %}
{% endunless %}

{% endfor %}
