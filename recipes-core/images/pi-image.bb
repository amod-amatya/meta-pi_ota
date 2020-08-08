include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL += " \
	kernel-modules \
	rauc \
	u-boot-fw-utils \
	htop \
	"

SPLASH = "psplash-raspberrypi"

IMAGE_FEATURES += "ssh-server-dropbear splash"

# do_image_prepend() {
#     bb.warn("The image 'rpi-basic-image' is deprecated, please use 'core-image-base' instead")
# }
