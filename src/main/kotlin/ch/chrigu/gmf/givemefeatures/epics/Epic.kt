package ch.chrigu.gmf.givemefeatures.epics

import java.util.UUID

data class Epic(val id: UUID?, val name: String, val description: String, val features: List<UUID>)
