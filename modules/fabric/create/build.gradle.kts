metadata("lol.bai.megane.module.create") {
    waila("MeganeCreate")
    mixin()

    fmj {
        depends(
            "create" to any
        )
    }
}

repositories {
    devos()
    tterrag()
    shedaniel()
    jamieswhiteshirt()
    cafeteria()
    ladysnake()
    jitpack()
}

dependencies {
    modImplementation(deps.fabric.create) {
        exclude("dev.emi:emi")
        exclude("com.github.LlamaLad7:MixinExtras")
        exclude("com.github.llamalad7.mixinextras:mixinextras-fabric")
        exclude("me.luligabi:NoIndium")
    }

    modImplementation(deps.fabric.mixinExtras)
    modImplementation(deps.fabric.noIndium)
}
