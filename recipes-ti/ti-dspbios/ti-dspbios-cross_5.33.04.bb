PR = "r1"

# NOTICE: The bios_setuplinux_${TI_PV}.bin cannot be directly
# downloaded and requires a TI account.  Download it and put it in
# your TI_PKG_DIR as specified in the conf/local.conf.

TI_PV = "${@bb.data.getVar('PV',d,1).replace('.', '_')}"
TI_PKG = "bios_setuplinux_${TI_PV}.bin"

SRC_URI = "\
           file://${TI_PKG} \
           file://ti_license.txt \
          "

SRC_URI[sha256sum] = "2c1e7feec569a19d3093b136da6aa03574f94052810fe7a78cc81eb37adda24b"

require ${PN}.inc
