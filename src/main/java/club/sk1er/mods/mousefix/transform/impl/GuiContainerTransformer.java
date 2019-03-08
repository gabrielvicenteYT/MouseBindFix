package club.sk1er.mods.mousefix.transform.impl;

import club.sk1er.mods.mousefix.transform.FramesTransformer;
import cpw.mods.fml.common.asm.transformers.deobf.FMLDeobfuscatingRemapper;
import org.objectweb.asm.Opcodes;
import org.objectweb.asm.tree.ClassNode;
import org.objectweb.asm.tree.InsnList;
import org.objectweb.asm.tree.InsnNode;
import org.objectweb.asm.tree.MethodInsnNode;
import org.objectweb.asm.tree.MethodNode;
import org.objectweb.asm.tree.VarInsnNode;

public final class GuiContainerTransformer implements FramesTransformer {

    @Override
    public String[] getClassNames() {
        return new String[]{"net.minecraft.client.gui.inventory.GuiContainer"};
    }

    @Override
    public void transform(ClassNode classNode, String name) {

        for (MethodNode method : classNode.methods) {
            String methodName = FMLDeobfuscatingRemapper.INSTANCE.mapMethodName(classNode.name, method.name, method.desc);

            if (methodName.equals("mouseClicked") || methodName.equalsIgnoreCase("func_73864_a")) {
                method.instructions.insertBefore(method.instructions.getLast().getPrevious(), this.getMod());
            }


        }
    }

    private InsnList getMod() {
        InsnList insnList = new InsnList();

        insnList.add(new VarInsnNode(Opcodes.ALOAD, 0));
        insnList.add(new VarInsnNode(Opcodes.ILOAD, 3));

        insnList.add(new VarInsnNode(Opcodes.BIPUSH, 100));
        insnList.add(new InsnNode(Opcodes.ISUB));


//        insnList.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "net/minecraft/client/gui/inventory/GuiContainer",
//                "checkHotbarKeys", "(I)Z", false));


        insnList.add(new MethodInsnNode(Opcodes.INVOKEVIRTUAL, "net/minecraft/client/gui/inventory/GuiContainer",
                "func_146983_a", "(I)Z", false));
        return insnList;
    }


}
