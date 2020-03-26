#!groovy
def tweet = {
    String userId, Date date, String message -> println "[$date] $userId: $message"
}
tweet("@gogomca", new Date(), "Primer tweet.")

def leftCurryTweet = tweet.curry("@gogomca")
leftCurryTweet(new Date()+1, "Segundo tweet.")

def rightCurryTweet = tweet.rcurry("Tercer tweet")
rightCurryTweet("@gogomca", new Date()+2 )

def indexCurryTweet = tweet.ncurry(1, new Date()+3)
indexCurryTweet("@gogomca", "Cuarto tweet")

