package net.yiyuanda.web.bean;

public class BaoYanStory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bao_yan_story.story_id
     *
     * @mbg.generated
     */
    private Integer storyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bao_yan_story.story_title
     *
     * @mbg.generated
     */
    private String storyTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bao_yan_story.story_describe
     *
     * @mbg.generated
     */
    private String storyDescribe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bao_yan_story.story_image
     *
     * @mbg.generated
     */
    private String storyImage;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column bao_yan_story.tm_smp
     *
     * @mbg.generated
     */
    private String tmSmp;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bao_yan_story.story_id
     *
     * @return the value of bao_yan_story.story_id
     *
     * @mbg.generated
     */
    public Integer getStoryId() {
        return storyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bao_yan_story.story_id
     *
     * @param storyId the value for bao_yan_story.story_id
     *
     * @mbg.generated
     */
    public void setStoryId(Integer storyId) {
        this.storyId = storyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bao_yan_story.story_title
     *
     * @return the value of bao_yan_story.story_title
     *
     * @mbg.generated
     */
    public String getStoryTitle() {
        return storyTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bao_yan_story.story_title
     *
     * @param storyTitle the value for bao_yan_story.story_title
     *
     * @mbg.generated
     */
    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle == null ? null : storyTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bao_yan_story.story_describe
     *
     * @return the value of bao_yan_story.story_describe
     *
     * @mbg.generated
     */
    public String getStoryDescribe() {
        return storyDescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bao_yan_story.story_describe
     *
     * @param storyDescribe the value for bao_yan_story.story_describe
     *
     * @mbg.generated
     */
    public void setStoryDescribe(String storyDescribe) {
        this.storyDescribe = storyDescribe == null ? null : storyDescribe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bao_yan_story.story_image
     *
     * @return the value of bao_yan_story.story_image
     *
     * @mbg.generated
     */
    public String getStoryImage() {
        return storyImage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bao_yan_story.story_image
     *
     * @param storyImage the value for bao_yan_story.story_image
     *
     * @mbg.generated
     */
    public void setStoryImage(String storyImage) {
        this.storyImage = storyImage == null ? null : storyImage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column bao_yan_story.tm_smp
     *
     * @return the value of bao_yan_story.tm_smp
     *
     * @mbg.generated
     */
    public String getTmSmp() {
        return tmSmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column bao_yan_story.tm_smp
     *
     * @param tmSmp the value for bao_yan_story.tm_smp
     *
     * @mbg.generated
     */
    public void setTmSmp(String tmSmp) {
        this.tmSmp = tmSmp == null ? null : tmSmp.trim();
    }
}