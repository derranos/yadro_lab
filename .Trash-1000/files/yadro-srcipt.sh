cd /mnt/newdisk/poky || exit
source oe-init-build-env
bitbake core-image-minimal
if [ "$run" = "yes" ]; then
    runqemu qemuparams="-m 512"
else
    echo "Image builded."
