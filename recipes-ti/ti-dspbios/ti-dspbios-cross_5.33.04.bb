require ${PN}.inc

PR = "r1"

# NOTICE: The bios_setuplinux_${TI_PV}.bin cannot be directly
# downloaded and requires a TI account.  Download it and put it in
# your TI_PKG_DIR as specified in the conf/local.conf.

SRC_URI = "\
           file://bios_setuplinux_${TI_PV}.bin \
           file://ti_license.txt \
          "

SRC_URI[sha256sum] = "2c1e7feec569a19d3093b136da6aa03574f94052810fe7a78cc81eb37adda24b"
