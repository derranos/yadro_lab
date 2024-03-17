cd /mnt/newdisk/poky || exit
source oe-init-build-env
bitbake core-image-minimal
if [ "$run" = "yes" ]; then
    export TERM=xterm-256color
    runqemu qemux86-64 qemuparams="-m 512" slirp nographic
else
    echo "Image builded."
fi
