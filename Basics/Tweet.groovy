@groovy.transform.ToString
class Tweet {
    String tweet
    String author
    Long likes = 10
    Long retweets = 10  

    void printTweet () {
        println "$tweet"
    }

    void doLike () {
        likes = likes + 1 
    }

    void doRetweet () {
        retweets++
        println "Retweeting $tweet"
    }
}