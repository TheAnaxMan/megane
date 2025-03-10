import org.gradle.kotlin.dsl.maven
import org.gradle.api.artifacts.dsl.RepositoryHandler as Repo

fun Repo.badasintended() = maven("https://maven.bai.lol")
fun Repo.bbkr() = maven("https://server.bbkr.space/artifactory/libs-release")
fun Repo.shedaniel() = maven("https://maven.shedaniel.me/")
fun Repo.modmaven() = maven("https://modmaven.dev")
fun Repo.jamieswhiteshirt() = maven("https://maven.jamieswhiteshirt.com/libs-release")
fun Repo.blamejared() = maven("https://maven.blamejared.com")
fun Repo.buildcraft() = maven("https://mod-buildcraft.com/maven")
fun Repo.cafeteria() = maven("https://maven.cafeteria.dev/releases")
fun Repo.jitpack() = maven("https://jitpack.io")
fun Repo.ladysnake() = maven("https://maven.ladysnake.org/releases")
fun Repo.wispforest() = maven("https://maven.wispforest.io")
fun Repo.devos() = maven("https://mvn.devos.one/snapshots")
fun Repo.tterrag() = maven("https://maven.tterrag.com")
fun Repo.terraformers() = maven("https://maven.terraformersmc.com/releases")

fun Repo.cursemaven() = maven("https://cursemaven.com") {
    content {
        includeGroup("curse.maven")
    }
}

fun Repo.modrinth() = maven("https://api.modrinth.com/maven") {
    content {
        includeGroup("maven.modrinth")
    }
}
