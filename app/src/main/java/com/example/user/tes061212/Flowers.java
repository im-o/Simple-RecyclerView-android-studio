package com.example.user.tes061212;

public class Flowers {
    private  String name, comment, photo, btnShare, btnMore;
    //get&setName
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //get&setComment
    public String getComment(){
        return comment;
    }
    public void setComment(String comment) {
        this.comment = comment;
    }
    //get&setPhoto
    public String getPhoto(){
        return photo;
    }
    public void setPhoto(String photo){
        this.photo = photo;
    }
    //button action
    public String getBtnMore(){
        return btnMore;
    }
    public void setBtnMore(String btnMore) {
        this.btnMore = btnMore;
    }
    public String getBtnShare() {
        return btnShare;
    }
    public void setBtnShare(String btnShare) {
        this.btnShare = btnShare;
    }
}
