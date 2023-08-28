object Main extends App {
  def countLetterOccurrences(words: List[String]): Int = {
    val totalLetterCount = words
      .map(_.length)
      .reduce(_ + _)

    totalLetterCount
  }

  val inputWords = List("apple", "banana", "cherry", "date")
  val totalCount = countLetterOccurrences(inputWords)
  println(s"Total count of letter occurrences: $totalCount")
}
