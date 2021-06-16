package com.dotfe.updater.model

import java.io.Serializable

class ChangelogItem : Serializable {
    var iconRes: Int? = null
    var title: String? = null
    var subtitle: String? = null
    var summary: String? = null
}