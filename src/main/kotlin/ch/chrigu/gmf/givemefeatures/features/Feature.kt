package ch.chrigu.gmf.givemefeatures.features

import ch.chrigu.gmf.givemefeatures.tasks.Task
import ch.chrigu.gmf.givemefeatures.tasks.TaskId

data class Feature(val id: FeatureId?, val name: String, val description: String, val tasks: List<TaskId>) {
    val latestTask get() = tasks.last()

    fun planNewTask(task: Task) = copy(tasks = tasks + task.id!!)

    companion object {
        fun describeNewFeature(name: String, description: String) = Feature(null, name, description, emptyList())
    }
}

@JvmInline
value class FeatureId(private val id: String) {
    override fun toString(): String = id
}