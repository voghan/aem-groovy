package com.cookbook.aem.components

import com.adobe.cq.sightly.WCMUse
import com.day.cq.tagging.Tag


class AuthorDetails extends WCMUse {

    private Tag authorTag;
    private String title = ""
    private String imagePath = ""
//    private List<Book> books;
    private String aboutAuthor = ""

    @Override
    void activate() throws Exception {

    }
}
