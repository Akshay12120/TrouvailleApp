package com.app_knit.base.repository.models

class DataSourceNotification {
    companion object {
        fun createData(): ArrayList<BlogPostNotification> {
            val list = ArrayList<BlogPostNotification>()
            list.add(
                    BlogPostNotification("Alex Added a travel trip for Eiffel Tower", "Paris , France", "15 Min ago", "https://www.thesun.co.uk/wp-content/uploads/2019/09/NINTCHDBPICT000490088796-e1569527674209.jpg")
            )
            list.add(
                    BlogPostNotification("Samantha sent you a Friend request", "", "15 Min ago", "data:image/jpeg;base64,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")
            )
            list.add(
                    BlogPostNotification("Harry Added a travel trip for Eiffel Tower ", "Paris , France", "15 Min ago", "data:image/jpeg;base64,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")
            )
            list.add(
                    BlogPostNotification("Jesica Added a travel trip for Eiffel Tower", "Paris , France", "15 Min ago", "https://storage.googleapis.com/afs-prod/media/media:b68dfb7787704c0fa4c79ef13dbb0fab/800.jpeg")
            )
            list.add(
                    BlogPostNotification("Jack has upload a photo in travel trip", "Paris , France", "15 Min ago", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRPgqQz0PVAnbBi8ICf5zjDY3BjY_uis83I7ctkT1RdZ-3tOM5H2g&s")
            )
            list.add(
                    BlogPostNotification("Emily has shared a photo on Facebook Eiffel Tower", "Paris , France", "15 Min ago", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmuoTMMHIvjBAmYnExYUt2c-_yuHFqdi2I-wrzR836Y_Spvhnp&s")
            )
            list.add(
                    BlogPostNotification("Alex", "Paris , France", "15 Min ago", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRmuoTMMHIvjBAmYnExYUt2c-_yuHFqdi2I-wrzR836Y_Spvhnp&s")
            )
            list.add(
                    BlogPostNotification("Alex", "Paris , France", "15 Min ago", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR2O3WghNlAxteAJVPeoeFaYMO-KC3AsWnKhzhW_YU2ot6ZUbzD-w&s")
            )
            return list
        }

    }
}