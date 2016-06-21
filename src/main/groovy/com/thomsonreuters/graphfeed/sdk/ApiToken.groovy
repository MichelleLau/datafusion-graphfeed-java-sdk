package com.thomsonreuters.graphfeed.sdk

import groovy.time.TimeCategory

class ApiToken {
    String accessToken
    Date issuedAt

    public boolean isExpired() {
        boolean isOld = false
        use (TimeCategory) {
            isOld = issuedAt.before(new Date() - 50.minutes)
        }
        return isOld
    }
}