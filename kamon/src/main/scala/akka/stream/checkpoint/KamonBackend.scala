package akka.stream.checkpoint

object KamonBackend {

  implicit val instance: CheckpointBackend = new CheckpointBackend {
    override def createRepository(name: String, tags: Map[String, String]): CheckpointRepository = KamonCheckpointRepository(name, tags)
  }
}
