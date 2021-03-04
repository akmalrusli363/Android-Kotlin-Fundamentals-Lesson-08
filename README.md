Android Kotlin Fundamentals Lesson 8: Connecting to the internet - MarsRealEstate
==============================

A project result of Android Kotlin Fundamentals Codelab 8: Connecting to the internet, which 
the starter code deployed from [MarsRealEstate-Starter](https://github.com/google-developer-training/android-kotlin-fundamentals-starter-apps/tree/master/MarsRealEstate-Starter)
within GitHub repository [google-developer-training/android-kotlin-fundamentals-starter-apps](https://github.com/google-developer-training/android-kotlin-fundamentals-starter-apps/)


Lesson Summary
--------------

Lesson 8 teaches you how to use community-developed libraries to connect to a web service
to retrieve and display data. You learn how to handle potential network errors and 
use the Glide library to load and display photos from the internet. 
You also build a RecyclerView and use it to display a grid of images.


Introduction
------------

MarsRealEstate is a demo app that shows available properties for sale and for rent on Mars.
The property data is stored on a Web server as a REST web service.  This app demonstrated
the use of [Retrofit](https://square.github.io/retrofit/) to make REST requests to the 
web service, [Moshi](https://github.com/square/moshi) to handle the deserialization of the 
returned JSON to Kotlin data objects, and [Glide](https://bumptech.github.io/glide/) to load and 
cache images by URL.  

The app also leverages [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel),
[LiveData](https://developer.android.com/topic/libraries/architecture/livedata), 
[Data Binding](https://developer.android.com/topic/libraries/data-binding/) with binding 
adapters, and [Navigation](https://developer.android.com/topic/libraries/architecture/navigation/) 
with the SafeArgs plugin for parameter passing between fragments.

Pre-requisites
--------------

You need to know:
- How to create and use fragments.
- How to navigate between fragments, and use safeArgs to pass data between fragments.
- How to use architecture components including ViewModel, ViewModelProvider.Factory, LiveData, and LiveData transformations.
- How to use coroutines for long-running tasks.


Getting Started
---------------

1. Download and run the app.

License
-------

Copyright 2019 Google, Inc.

Licensed to the Apache Software Foundation (ASF) under one or more contributor
license agreements.  See the NOTICE file distributed with this work for
additional information regarding copyright ownership.  The ASF licenses this
file to you under the Apache License, Version 2.0 (the "License"); you may not
use this file except in compliance with the License.  You may obtain a copy of
the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
License for the specific language governing permissions and limitations under
the License.