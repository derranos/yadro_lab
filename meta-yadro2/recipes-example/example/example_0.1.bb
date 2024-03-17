SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "Recipe created by bitbake-layers"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://yadro_hello.c;md5=e374d0c29db6c6437fe83e146ff36ba3"

SRC_URI = "file://yadro_hello.c"
S = "${WORKDIR}"

do_compile() {
    gcc ${S}/yadro_hello.c -o ${S}/yadro_hello
}
do_install () {
    install -d ${D}${bindir}
    install -m 0755 ${S}/yadro_hello ${D}${bindir}
}

FILES_${PN} += "${bindir}"
EXTRA_OEMAKE += "-I${S}/usr/bin' "
